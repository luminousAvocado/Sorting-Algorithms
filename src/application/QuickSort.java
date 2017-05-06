package application;

import java.util.List;

public class QuickSort<E extends Comparable> {

	
	private double comparisonCounter;
	private double swapCounter;
	

	// Initial quick_sort method, calls overloaded method to begin recursion
	public void quick_sort(List<E> inputList){
		quick_sort(inputList, 0, inputList.size() - 1);
	}
	
	
	/*
	 * This method takes the list, makes call to partition which will initially
	 * take the pivot, move it into position with all Objects < pivot on the left,
	 * all Objects > pivot on the right.
	 * And then recursively goes through the same process for both left and right sides
	*/
	public void quick_sort(List<E> inputList, int low, int high){
		if(low < high){
			int p = partition(inputList, low, high); // Splits list in half
			quick_sort(inputList, low, p - 1); // Recursive quick_sort on left half
			quick_sort(inputList, p + 1, high); // Recursive quick_sort on right half
		}
	}
	
	
	/*
	 * Sets pivot as the LAST index of list, (i = 1 - firstIndex)
	 * Goes through each element of list up to but not including pivot
	 * If list[j] <= pivot, i++, and swap list[i] with list[j]
	 * After loop ends, swap list[i+1] with pivot, we know pivot < i+1 since
	 * previously skipped over in for loop
	*/
	public int partition(List<E> inputList, int low, int high){
		
		E pivot = inputList.get(high);
		int i = low - 1;
		
		for(int j = low; j < high; j++){
			
			comparisonCounter++;
			
			if(inputList.get(j).compareTo(pivot) <= 0){
				i = i + 1;
				E tempJ = inputList.get(j);
				inputList.set(j, inputList.get(i));
				inputList.set(i, tempJ);
				swapCounter++;
			}
		}
		
		E tempHigh = inputList.get(high);
		inputList.set(high, inputList.get(i + 1));
		inputList.set(i + 1, tempHigh);
		swapCounter++;
		
		return i + 1;
	}
	
	
	public double getComparisonCounter(){
		return this.comparisonCounter;
	}
	
	public double getSwapCounter(){
		return this.swapCounter;
	}
}
