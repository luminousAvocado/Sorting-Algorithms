package application;

import java.util.ArrayList;
import java.util.List;

public class Heap<E extends Comparable<E>> {

	
	private List<E> heapList = new ArrayList<>();
	private String heapType;
	private double comparisonCounter;
	private double swapCounter;
	
	
	
	// Constructor, sets heap type(Max or Min)
	public Heap(String heapType){
		
		this.heapType = heapType;
	}
	
	
	
	// Constructor, sets heap type(Max or Min) and populates with input list
	public Heap(String heapType, List<E> inputList){
		
		this.heapType = heapType;
		List<E> copyList = new ArrayList<>();
		
		for(int index = 0; index < inputList.size(); index++){
			copyList.add(inputList.get(index));
		}
	}
	
	
	
	/*
	 * Add node to end of list and percolate up
	*/
	public void addNode(E newNode){
		
		
		heapList.add(newNode);
		int currentIndex = heapList.size() - 1;
		
		// if Max heap
		if(heapType == "Max"){
			
			while(currentIndex > 0){
				
				comparisonCounter++;
				
				int parentIndex = (currentIndex - 1) / 2;
				
				// If current > parent, move up, swap with parent
				if(heapList.get(currentIndex).compareTo(heapList.get(parentIndex)) > 0){
					
					// Save current node to temp
					E temp = heapList.get(currentIndex);
					
					// Move parent node down to current node's index
					heapList.set(currentIndex, heapList.get(parentIndex));
					
					// Move current node up to parent node's index
					heapList.set(parentIndex, temp);
					
					swapCounter++;
				}
				// current Node is NOT > parent Node, so break
				else{
					break;
				}
				
				// Update current index to its' new index(parent index)
				currentIndex = parentIndex;
			}
		}
		
		// if Min heap
		if(heapType == "Min"){
			
			while(currentIndex > 0){
				
				comparisonCounter++;
				
				int parentIndex = (currentIndex - 1) / 2;
				
				// If current < parent, move up, swap with parent
				if (heapList.get(currentIndex).compareTo(heapList.get(parentIndex)) < 0) {

					// Save current node to temp
					E temp = heapList.get(currentIndex);

					// Move parent node down to current node's index
					heapList.set(currentIndex, heapList.get(parentIndex));

					// Move current node up to parent node's index
					heapList.set(parentIndex, temp);
					
					swapCounter++;
				} 
				// current Node is NOT < parent Node, so break
				else {
					break;
				}
				
				// Update current index to its' new index(parent index)
				currentIndex = parentIndex;
			}
		}
	}
	
	
	
	/*
	 * Remove node
	*/
	public E removeNode(){
		
		
		// If list is empty, return null
		if(heapList.size() == 0){
			return null;
		}
		
		// Sets node for removal(root) to a temp
		E removedNode = heapList.get(0);
		
		// Move last node to root index
		heapList.set(0, heapList.get(heapList.size() - 1));
		
		// Remove last node from list
		heapList.remove(heapList.size() - 1);
		
		// current node index
		int currentIndex = 0;
		
		
		// If Max heap
		if(heapType == "Max"){
			
			while (currentIndex < heapList.size()) {

				int leftChildIndex = (2 * currentIndex) + 1;
				int rightChildIndex = (2 * currentIndex) + 2;
				
				// If current Node has no left child
				if (leftChildIndex >= heapList.size()) {
					break;
				}

				int maxIndex = leftChildIndex;
				
				if(rightChildIndex < heapList.size()){
					
					if(heapList.get(maxIndex).compareTo(heapList.get(rightChildIndex)) < 0){
						
						maxIndex = rightChildIndex;
					}
				}
				
				// Swap if the current node is less than the max child
				if(heapList.get(currentIndex).compareTo(heapList.get(maxIndex)) < 0){
					
					E temp = heapList.get(maxIndex);
					
					heapList.set(maxIndex, heapList.get(currentIndex));
					
					heapList.set(currentIndex, temp);
					
					currentIndex = maxIndex;
				}
				else{
					break;
				}
			}
		}
		
		
		// If Min heap
		if(heapType == "Min"){
			
			while(currentIndex < heapList.size()){
				
				int leftChildIndex = (2 * currentIndex) + 1;
				int rightChildIndex = (2 * currentIndex) + 2;
				
				
				// current Node has no children(out of index), break
				if(leftChildIndex >= heapList.size()){
					break;
				}
				
				// set min index as left child index initially
				int minIndex = leftChildIndex;
				
				// if right child index is within array size
				if(rightChildIndex < heapList.size()){
					
					// if left child > right child, set min child to right child
					if(heapList.get(minIndex).compareTo(heapList.get(rightChildIndex)) > 0){
						
						minIndex = rightChildIndex;
					}
				}
				
				comparisonCounter++;
				
				// Swap if the current node is greater than min child
				if(heapList.get(currentIndex).compareTo(heapList.get(minIndex)) > 0){
					
					E temp = heapList.get(minIndex);
					
					heapList.set(minIndex, heapList.get(currentIndex));
					
					heapList.set(currentIndex, temp);
					
					currentIndex = minIndex;
					
					swapCounter++;
				}	
				else{
					break;
				}
			}
		}
		
		return removedNode;
	}
	
	
	public double getComparisonCounter(){
		return comparisonCounter;
	}
	
	
	public double getSwapCounter(){
		return swapCounter;
	}
	
	
	public String toString(){
		
		for(int index = 0; index < heapList.size(); index++){
			System.out.print(heapList.get(index) + ", ");
		}
		
		return "End of list.";
	}
	
}
