package application;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NonComparisonSorting{

	
	private Duration sortTime;
	
	public void setSortTime(){
		this.sortTime = null;
	}
	
	public Duration getSortTime(){
		return this.sortTime;
	}

	
	
	
	/*
	 * Counting Sort
	 * double k should be a number higher than max value. 
	 * !!! Possible case where the max value is the max value of int,
	 * !!! in that case, this method would fail since we need a list of size k + 1, and k = max int value
	 * !!! but ArrayList max size is limited to max int value
	*/
	public List<Integer> countingSort(List<Integer> inputList){
		
		// This makes a copy of the inputList
		List<Integer> copiedList = new ArrayList<>();
		for(int index = 0; index < inputList.size(); index++){
			copiedList.add(inputList.get(index));
		}
		
		
		// Finds max value of elements in list
		int max = Collections.max(copiedList);
		int k = max + 1;
		
		
		/*
		 * Beginning of counting sort
		*/
		Instant startTime = Instant.now();
		// This creates the empty list "results", same size as inputList, 
		List<Integer> result = new ArrayList<>();
		for(int index = 0; index < copiedList.size(); index++){
			result.add(0);
		}
		
		// This creates the empty list "counts", size = k + 1
		List<Integer> counts = new ArrayList<>(k + 1);
		// This initializes ALL counts[index] to 0
		for(int i = 0; i < k + 1; i++){
			counts.add(i, 0);
		}
		
		// Stores and increments the count of a number each time it occurs in copiedList
		for(int i = 0; i < copiedList.size(); i++){
			counts.set(copiedList.get(i), counts.get(copiedList.get(i)) + 1);
		}
		
		// Change counts[i] so that counts[i] now contains position of 
		for(int i = 1; i < k + 1; i++){
			counts.set(i, counts.get(i - 1) + counts.get(i));
		}
		
		// Builds results list
		for(int i = copiedList.size() - 1; i > -1; i--){
			result.set(counts.get(copiedList.get(i)) - 1, copiedList.get(i));
			counts.set(copiedList.get(i), counts.get(copiedList.get(i)) - 1);
		}
		Instant endTime = Instant.now();
		sortTime = Duration.between(startTime, endTime);
		
		return result;
	}
	
	
	
	
	/*
	 * Radix Sort
	*/
	public List<Integer> radixSort(List<Integer> inputList){
		
		// Creates a copy of inputList
		List<Integer> copiedList = new ArrayList<>();
		for(int index = 0; index < inputList.size(); index++){
			copiedList.add(inputList.get(index));
		}
		
		// Beginning of Radix Sort
		// Initialize buckets 0 - 9
		Instant startTime = Instant.now();
		List<Integer>[] buckets = new List[10];
		for(int index = 0; index < buckets.length; index++){
			buckets[index] = new ArrayList<>();
		}
		
		// Gets max number and finds the number of digits in it
		int max = Collections.max(copiedList);
		int numOfDigits = 1;
		while((max / 10) > 0){
			numOfDigits++;
			max = max / 10;
		}

		// Outer for loop is testing all numbers at i position, so i = 1 is 1s place, i = 2 is 10s place, i = 3 is 100s place...
		for(int i = 1; i < numOfDigits + 1; i++){		
			
			// Inner loop tests all numbers at outerloop position
			for(int j = 0; j < copiedList.size(); j++){		
				
				// This sets what we need to divide by
				int divider = 1;
				for(int counter = 1; counter < i; counter++){
					divider = divider * 10; 
				}
				
				// i = 1 (div by 1), i = 2 (div by 10), i = 3 (div by 100)
				int key = (copiedList.get(j) / divider) % 10;
				
				// Adds number to bucket[key]
				buckets[key].add(copiedList.get(j));
			}
			
			int k = 0;
			
			// Move numbers back into baseList in the new order
			for(int j = 0; j < buckets.length; j++){
				for(int x : buckets[j]){
					copiedList.set(k++, x);
				}
				buckets[j].clear();
			}
		}
		Instant endTime = Instant.now();
		sortTime = Duration.between(startTime, endTime);
		
		return copiedList;
	}
	
}
