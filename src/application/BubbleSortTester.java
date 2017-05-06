package application;

import java.util.ArrayList;
import java.util.List;

public class BubbleSortTester {

	
	ComparisonSorting<Integer> comparisonSort = new ComparisonSorting();

	
	// Creates a new empty List<Integer> for testing
	List<Integer> testList = new ArrayList<>();
	List<Integer> listOf10 = new ArrayList<>();
	List<Integer> listOf100 = new ArrayList<>();
	List<Integer> listOf1000 = new ArrayList<>();
	List<Integer> listOf10000 = new ArrayList<>();
	List<Integer> listOf100000 = new ArrayList<>();

	
	// Constructor that sets the lists needed
	public BubbleSortTester(List<Integer> testList, List<Integer> listOf10, List<Integer> listOf100, List<Integer> listOf1000,
			List<Integer> listOf10000, List<Integer> listOf100000) {
		
		this.testList = testList;
		this.listOf10 = listOf10;
		this.listOf100 = listOf100;
		this.listOf1000 = listOf1000;
		this.listOf10000 = listOf10000;
		this.listOf100000 = listOf100000;
	}

	// Initiates Bubble Sort for test List
	public void testListSort(){
		
		List<Integer> testListSorted = comparisonSort.bubbleSort(testList);
		System.out.print("\n\n\nBubble Sort Example: \n");
		System.out.println("Orig List: " + testList);
		System.out.println("Sort List: " + testListSorted);
		System.out.println("Bubble Sort Comparison Counter: " + comparisonSort.getComparisonCounter());
		System.out.println("Bubble Sort Swap Counter: " + comparisonSort.getSwapCounter());
		System.out.println("Bubble Sort Time: " + comparisonSort.getSortTime());
		comparisonSort.setComparisonCounter(0);
		comparisonSort.setSwapCounter(0);
		comparisonSort.setSortTime();
	}
	
	// Initiates Bubble Sort for 10 ints
	public void bubbleSort10() {

		List<Integer> bubbleList10 = comparisonSort.bubbleSort(listOf10);
		System.out.print("\n\n\nBubble Sort 10: ");
		System.out.println("\nBubble Sort Comparison Counter: " + comparisonSort.getComparisonCounter());
		System.out.println("Bubble Sort Swap Counter: " + comparisonSort.getSwapCounter());
		System.out.println("Bubble Sort Time: " + comparisonSort.getSortTime());
		comparisonSort.setComparisonCounter(0);
		comparisonSort.setSwapCounter(0);
		comparisonSort.setSortTime();
	}

	
	
	// Initiates Bubble Sort for 100 ints
	public void bubbleSort100() {

		List<Integer> bubbleList100 = comparisonSort.bubbleSort(listOf100);
		System.out.print("\n\n\nBubble Sort 100: ");
		System.out.println("\nBubble Sort Comparison Counter: " + comparisonSort.getComparisonCounter());
		System.out.println("Bubble Sort Swap Counter: " + comparisonSort.getSwapCounter());
		System.out.println("Bubble Sort Time: " + comparisonSort.getSortTime());
		comparisonSort.setComparisonCounter(0);
		comparisonSort.setSwapCounter(0);
		comparisonSort.setSortTime();
	}

	
	
	// Initiates Bubble Sort for 1000 ints
	public void bubbleSort1000() {

		List<Integer> bubbleList1000 = comparisonSort.bubbleSort(listOf1000);
		System.out.print("\n\n\nBubble Sort 1000: ");
		System.out.println("\nBubble Sort Comparison Counter: " + comparisonSort.getComparisonCounter());
		System.out.println("Bubble Sort Swap Counter: " + comparisonSort.getSwapCounter());
		System.out.println("Bubble Sort Time: " + comparisonSort.getSortTime());
		comparisonSort.setComparisonCounter(0);
		comparisonSort.setSwapCounter(0);
		comparisonSort.setSortTime();
	}

	
	
	// Initiates Bubble Sort for 10000 ints
	public void bubbleSort10000() {

		List<Integer> bubbleList10000 = comparisonSort.bubbleSort(listOf10000);
		System.out.print("\n\n\nBubble Sort 10000: ");
		System.out.println("\nBubble Sort Comparison Counter: " + comparisonSort.getComparisonCounter());
		System.out.println("Bubble Sort Swap Counter: " + comparisonSort.getSwapCounter());
		System.out.println("Bubble Sort Time: " + comparisonSort.getSortTime());
		comparisonSort.setComparisonCounter(0);
		comparisonSort.setSwapCounter(0);
		comparisonSort.setSortTime();
	}

	
	
	// Initiates Bubble Sort for 100000 ints
	public void bubbleSort100000() {

		List<Integer> bubbleList100000 = comparisonSort.bubbleSort(listOf100000);
		System.out.print("\n\n\nBubble Sort 100000: ");
		System.out.println("\nBubble Sort Comparison Counter: " + comparisonSort.getComparisonCounter());
		System.out.println("Bubble Sort Swap Counter: " + comparisonSort.getSwapCounter());
		System.out.println("Bubble Sort Time: " + comparisonSort.getSortTime());
		comparisonSort.setComparisonCounter(0);
		comparisonSort.setSwapCounter(0);
		comparisonSort.setSortTime();
	}
}
