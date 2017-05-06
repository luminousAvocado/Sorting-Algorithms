package application;

import java.util.ArrayList;
import java.util.List;

public class QuickSortTester {

	ComparisonSorting<Integer> comparisonSort = new ComparisonSorting<>();

	
	// Creates a new empty List<Integer> for testing
	List<Integer> testList = new ArrayList<>();
	List<Integer> listOf10 = new ArrayList<>();
	List<Integer> listOf100 = new ArrayList<>();
	List<Integer> listOf1000 = new ArrayList<>();
	List<Integer> listOf10000 = new ArrayList<>();
	List<Integer> listOf100000 = new ArrayList<>();

	
	// Constructor that sets the lists needed
	public QuickSortTester(List<Integer> testList, List<Integer> listOf10, List<Integer> listOf100, List<Integer> listOf1000,
			List<Integer> listOf10000, List<Integer> listOf100000) {

		this.testList = testList;
		this.listOf10 = listOf10;
		this.listOf100 = listOf100;
		this.listOf1000 = listOf1000;
		this.listOf10000 = listOf10000;
		this.listOf100000 = listOf100000;
	}

	// Initiates Quick Sort for test List
	public void testListSort(){
		
		List<Integer> testListSorted = comparisonSort.quickSort(testList);
		System.out.print("\n\n\nQuick Sort Example: \n");
		System.out.println("Orig List: " + testList);
		System.out.println("Sort List: " + testListSorted);
		System.out.println("Quick Sort Comparison Counter: " + comparisonSort.getComparisonCounter());
		System.out.println("Quick Sort Swap Counter: " + comparisonSort.getSwapCounter());
		System.out.println("Quick Sort Time: " + comparisonSort.getSortTime());
		comparisonSort.setComparisonCounter(0);
		comparisonSort.setSwapCounter(0);
		comparisonSort.setSortTime();
	}
	
	// Initiates Quick Sort for 10 ints
	public void quickSort10() {

		List<Integer> quickList10 = comparisonSort.quickSort(listOf10);
		System.out.print("\n\n\nQuick Sort 10: ");
		// for (int index = 0; index < bubbleList10.size(); index++) {
		// System.out.print(bubbleList10.get(index) + ", ");
		// }
		System.out.println("\nQuick Sort Comparison Counter: " + comparisonSort.getComparisonCounter());
		System.out.println("Quick Sort Swap Counter: " + comparisonSort.getSwapCounter());
		System.out.println("Quick Sort Time: " + comparisonSort.getSortTime());
		comparisonSort.setComparisonCounter(0);
		comparisonSort.setSwapCounter(0);
		comparisonSort.setSortTime();
	}

	
	
	// Initiates Quick Sort for 100 ints
	public void quickSort100() {

		List<Integer> quickList100 = comparisonSort.quickSort(listOf100);
		System.out.print("\n\n\nQuick Sort 100: ");
		// for (int index = 0; index < bubbleList100.size(); index++) {
		// System.out.print(bubbleList100.get(index) + ", ");
		// }
		System.out.println("\nQuick Sort Comparison Counter: " + comparisonSort.getComparisonCounter());
		System.out.println("Quick Sort Swap Counter: " + comparisonSort.getSwapCounter());
		System.out.println("Quick Sort Time: " + comparisonSort.getSortTime());
		comparisonSort.setComparisonCounter(0);
		comparisonSort.setSwapCounter(0);
		comparisonSort.setSortTime();
	}

	
	
	// Initiates Quick Sort for 1000 ints
	public void quickSort1000() {

		List<Integer> quickList1000 = comparisonSort.quickSort(listOf1000);
		System.out.print("\n\n\nQuick Sort 1000: ");
		// for (int index = 0; index < bubbleList1000.size(); index++) {
		// System.out.print(bubbleList1000.get(index) + ", ");
		// }
		System.out.println("\nQuick Sort Comparison Counter: " + comparisonSort.getComparisonCounter());
		System.out.println("Quick Sort Swap Counter: " + comparisonSort.getSwapCounter());
		System.out.println("Quick Sort Time: " + comparisonSort.getSortTime());
		comparisonSort.setComparisonCounter(0);
		comparisonSort.setSwapCounter(0);
		comparisonSort.setSortTime();
	}

	
	
	// Initiates Quick Sort for 10000 ints
	public void quickSort10000() {

		List<Integer> quickList10000 = comparisonSort.quickSort(listOf10000);
		System.out.print("\n\n\nQuick Sort 10000: ");
		// for (int index = 0; index < bubbleList10000.size(); index++) {
		// System.out.print(bubbleList10000.get(index) + ", ");
		// }
		System.out.println("\nQuick Sort Comparison Counter: " + comparisonSort.getComparisonCounter());
		System.out.println("Quick Sort Swap Counter: " + comparisonSort.getSwapCounter());
		System.out.println("Quick Sort Time: " + comparisonSort.getSortTime());
		comparisonSort.setComparisonCounter(0);
		comparisonSort.setSwapCounter(0);
		comparisonSort.setSortTime();
	}

	
	
	// Initiates Quick Sort for 100000 ints
	public void quickSort100000() {

		List<Integer> quickList100000 = comparisonSort.quickSort(listOf100000);
		System.out.print("\n\n\nQuick Sort 100000: ");
		// for (int index = 0; index < bubbleList100000.size(); index++) {
		// System.out.print(bubbleList100000.get(index) + ", ");
		// }
		System.out.println("\nQuick Sort Comparison Counter: " + comparisonSort.getComparisonCounter());
		System.out.println("Quick Sort Swap Counter: " + comparisonSort.getSwapCounter());
		System.out.println("Quick Sort Time: " + comparisonSort.getSortTime());
		comparisonSort.setComparisonCounter(0);
		comparisonSort.setSwapCounter(0);
		comparisonSort.setSortTime();
	}
}
