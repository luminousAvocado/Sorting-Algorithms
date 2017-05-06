package application;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparisonSorting<E extends Comparable> {

	private double swapCounter = 0;
	private double comparisonCounter = 0;
	private Duration sortTime;
	
	
	
	public void setSwapCounter(int swapCounter){
		this.swapCounter = swapCounter;
	}
	
	public double getSwapCounter(){
		return swapCounter;
	}
	
	public void setComparisonCounter(int comparisonCounter){
		this.comparisonCounter = comparisonCounter;
	}
	
	public double getComparisonCounter(){
		return comparisonCounter;
	}
	
	public void setSortTime(){
		this.sortTime = null;
	}
	
	public Duration getSortTime(){
		return sortTime;
	}
	
	
	
	/*
	 * Bubble Sort Method
	 * Compares each element in the list with each element in the list
	 * Skipping over the ones that have already been swapped
	*/
	protected List<E> bubbleSort(List<E> inputList){
		
		// This block makes a hard copy of inputList
		List<E> copiedList = new ArrayList<>();	
		for(int index = 0; index < inputList.size(); index++){
			copiedList.add(inputList.get(index));
		}
		
		boolean swapped;
		
		// This block starts the bubble sorting
		Instant startTime = Instant.now(); // Sort start time
		for(int i = 1; i < copiedList.size(); i++){
			
			swapped = false;
			
			for(int j = 0; j < copiedList.size() - 1; j++){
				
				comparisonCounter++;
				
				if(copiedList.get(j).compareTo(copiedList.get(j + 1)) == 1){
					E temp = copiedList.get(j+ 1);
					copiedList.set(j + 1, copiedList.get(j));
					copiedList.set(j, temp);
					swapped = true;
					swapCounter++;
				}
			}
			
			if(!swapped){
				break;
			}
		}
		
		Instant endTime = Instant.now(); // Sort end time
		sortTime = Duration.between(startTime, endTime); // Sort total time
		
		return copiedList;
	}
	
	
	
	/*
	 * Selection Sort Method 
	 * Iterates through the list starting at index current = 0, and finds lowest value,
	 * set min at current, current increments, and then repeat, finding lowest between
	 * current through list.size
	*/
	protected List<E> selectionSort(List<E> inputList){
		
		// This block makes a hard copy of inputList
		List<E> copiedList = new ArrayList<>();
		for(int index = 0; index < inputList.size(); index++){
			copiedList.add(inputList.get(index));
		}
		
		int min;
		
		// This block starts the selection sorting
		Instant startTime = Instant.now(); // Sort start time
		for(int i = 0; i < copiedList.size(); i++){
			
			min = i;
			
			// Iterate through list to find lowest value, set as min
			for(int j = i + 1; j < copiedList.size(); j++){
				
				comparisonCounter++;
				
				if(copiedList.get(j).compareTo(copiedList.get(min)) == -1){
					min = j;
				}
			}
			
			E temp = copiedList.get(min);
			
			copiedList.set(min, copiedList.get(i));
			copiedList.set(i, temp);
			swapCounter++;
		}
		
		Instant endTime = Instant.now(); // Sort end time
		sortTime = Duration.between(startTime, endTime); // Sort total time
			
		return copiedList;
	}
	
	
	
	/*
	 * Insertion Sort Method 
	 * Consider only the indices from 0 to i each loop
	 * temp = list[i]
	 * Compares temp to list[i] and moves the element down the list if necessary
	 * Inserts temp once either at beginning of list or in between elements both greater and less than
	*/
	protected List<E> insertionSort(List<E> inputList){
			
		// This block makes a hard copy of the list
		List<E> copiedList = new ArrayList<>();
		for(int index = 0; index < inputList.size(); index++){
			copiedList.add(inputList.get(index));
		}
		
		// This block starts the insertion sorting
		Instant startTime = Instant.now(); // Sort start time
		for(int i = 1; i < copiedList.size(); i++){
			
			E temp = copiedList.get(i);
			int j = i;
			
			while(j > 0 && temp.compareTo(copiedList.get(j - 1)) == -1){
				comparisonCounter++;
				copiedList.set(j, copiedList.get(j - 1));
				j--;
			}
			
			swapCounter++;
			copiedList.set(j, temp);
		}
		
		Instant endTime = Instant.now(); // Sort end time
		sortTime = Duration.between(startTime, endTime); // Sort total time
		
		return copiedList;
	}
	
	
	
	/*
	 * Heap Sort Method 
	 * Adds elements to Heap
	 * Removes root each time from Heap, which will always be the max or min value
	 * Moves last element from Heap to root and percolate down, which automatically
	 * places the next max or min into root position
	*/
	protected List<E> heapSort(List<E> inputList){
			
		// This block makes a hard copy of the list
		List<E> copiedList = new ArrayList<>();
		for(int index = 0; index < inputList.size(); index++){
			copiedList.add(inputList.get(index));
		}
		
		// This block adds all elements to Heap
		Instant startTime = Instant.now(); // Sort start time
		Heap newHeap = new Heap("Min");
		for(int index = 0; index < copiedList.size(); index++){
			newHeap.addNode(copiedList.get(index));
		}
		
		// This block removes elements one by one from Heap and adds to new list
		List<E> sortedList = new ArrayList<>();
		for(int index = 0; index < copiedList.size(); index++){
			sortedList.add((E) newHeap.removeNode());
		}
		Instant endTime = Instant.now(); // Sort end time
		sortTime = Duration.between(startTime, endTime); // Sort total time
		
		this.comparisonCounter = newHeap.getComparisonCounter();
		this.swapCounter = newHeap.getSwapCounter();
		
		return sortedList;
	}
	
	
	
	/*
	 * Merge Sort Method
	*/
	protected List<E> mergeSort(List<E> inputList){
		
		// This block makes a hard copy of the list
		List<E> copiedList = new ArrayList<>();
		for(int index = 0; index < inputList.size(); index++){
			copiedList.add(inputList.get(index));
		}
		
		// This block starts the merge sort
		Instant startTime = Instant.now();
		MergeSort newMergeSort = new MergeSort();
		newMergeSort.merge_sort(copiedList);
		Instant endTime = Instant.now();
		sortTime = Duration.between(startTime, endTime);
		
		this.comparisonCounter = newMergeSort.getComparisonCounter();
		this.swapCounter = newMergeSort.getSwapCounter();
		
		return copiedList;
	}
	
	
	
	/*
	 * Quick Sort Method
	*/
	protected List<E> quickSort(List<E> inputList){
		
		// This block makes a hard copy of the list
		List<E> copiedList = new ArrayList<>();
		for(int index = 0; index < inputList.size(); index++){
			copiedList.add(inputList.get(index));
		}
		
		// This block starts the quick sort
		Instant startTime = Instant.now();
		QuickSort newQuickSort = new QuickSort();
		newQuickSort.quick_sort(copiedList);
		Instant endTime = Instant.now();
		sortTime = Duration.between(startTime, endTime);
		
		this.comparisonCounter = newQuickSort.getComparisonCounter();
		this.swapCounter = newQuickSort.getSwapCounter();
		
		return copiedList;
	}
}
