package application;

import java.util.ArrayList;
import java.util.List;

public class MergeSort<E extends Comparable> {
	
	
	private static double comparisonCounter;
	private static double swapCounter;
	
	/*
	 * This method recursively splits the list in half
	 * Initially continuously splitting the left half until list.size = 1, going down
	 * When left.size = 1, then it merges left + right
	 * which returns a merged List which becomes the new left list, going back up to last recursive call
	 * While going back up to each recursive call, it goes through same process of splitting and merging each right half
	 * 
	 * In other words.
	 * Split initial list in half
	 * Recursively split each Left list in half
	 * Once base case reached, recursively split Right list in half at that same level (recursive call)
	 * Merge the two lists at the same level, which becomes the new Left list, going back up the recursive calls
	 * Again, at each recursive call going back up, repeat recursive split for Right list
	 * 
	 * Looks a bit like a tree doing PostOrder Traversal (Left, Right, Current)
	*/
	public static<E> void merge_sort(List<E> inputList){
		
		
		// If list size is > 1
		if(inputList.size() > 1){
			
			// Finds midpoint of list size
			int mid = (inputList.size() / 2);
			
			// Creates a left half list
			List<E> leftList = new ArrayList<>();
			
			// Copies left half of inputList to leftList
			leftList.addAll(inputList.subList(0, mid));

			// Recursively call merge_sort on leftList
			merge_sort(leftList);
			
			// Creates a right half list
			List<E> rightList = new ArrayList<>();
			
			// Copies right half of inputList to leftList
			rightList.addAll(inputList.subList(mid, inputList.size()));
			
			// Recursively call merge_sort on rightList
			merge_sort(rightList);
			
			// Sends 2 halves of a list to be sorted and merged
			merge(leftList, rightList, inputList);
		}
	}
	
	
	// This method will sort and merge two lists, "Merging"
	public static<E> void merge(List<E> leftList, List<E> rightList, List<E> inputList){
		
		int i = 0, j = 0, k = 0;
		
		// Continues while either i OR j is less than list.size, until either all elements from Left or Right have been added
		while(i < leftList.size() && j < rightList.size()){
			
			comparisonCounter++;
			
			if(((Comparable) leftList.get(i)).compareTo(rightList.get(j)) < 0){	
				inputList.set(k, leftList.get(i));
				i++;
				swapCounter++;
			}
			else{
				inputList.set(k, rightList.get(j));
				j++;
				swapCounter++;
			}
			k++;
		}
		
		// If Left list items left over, adds them in, these will already be sorted so ok to add one by one
		while(i < leftList.size()){
			inputList.set(k, leftList.get(i));
			i++;
			k++;
		}
		// Same as above
		while(j < rightList.size()){
			inputList.set(k, rightList.get(j));
			j++;
			k++;
		}
	}	
	
	public double getComparisonCounter(){
		return comparisonCounter;
	}
	
	public double getSwapCounter(){
		return swapCounter;
	}
}
