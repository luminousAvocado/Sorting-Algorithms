package application;

import java.util.ArrayList;
import java.util.List;

public class CountingSortTester {

	NonComparisonSorting nonComparisonSort = new NonComparisonSorting();

	// Creates a new empty List<Integer> for testing
	List<Integer> testList = new ArrayList<>();
	List<Integer> listOf10 = new ArrayList<>();
	List<Integer> listOf100 = new ArrayList<>();
	List<Integer> listOf1000 = new ArrayList<>();
	List<Integer> listOf10000 = new ArrayList<>();
	List<Integer> listOf100000 = new ArrayList<>();

	// Constructor that sets the lists needed
	public CountingSortTester(List<Integer> testList, List<Integer> listOf10, List<Integer> listOf100, List<Integer> listOf1000,
			List<Integer> listOf10000, List<Integer> listOf100000) {

		this.testList = testList;
		this.listOf10 = listOf10;
		this.listOf100 = listOf100;
		this.listOf1000 = listOf1000;
		this.listOf10000 = listOf10000;
		this.listOf100000 = listOf100000;
	}
	
	// Initiates Counting Sort for test List
	public void testListSort(){
		
		List<Integer> testListSorted = nonComparisonSort.countingSort(testList);
		System.out.println("\n\n\nCounting Sort Example: \n");
		System.out.println("Orig List: " + testList);
		System.out.println("Sort List: " + testListSorted);
		System.out.println("Counting Sort Time: " + nonComparisonSort.getSortTime());
		nonComparisonSort.setSortTime();
	}

	// Initiates Counting Sort for 10 ints
	public void countingSort10() {

		List<Integer> countList10 = nonComparisonSort.countingSort(listOf10);
		System.out.print("\n\n\nCounting Sort 10: ");
		System.out.println("\nCounting Sort Time: " + nonComparisonSort.getSortTime());
		nonComparisonSort.setSortTime();
	}

	// Initiates Counting Sort for 100 ints
	public void countingSort100() {

		List<Integer> countList100 = nonComparisonSort.countingSort(listOf100);
		System.out.print("\n\n\nCounting Sort 100: ");
		System.out.println("\nCounting Sort Time: " + nonComparisonSort.getSortTime());
		nonComparisonSort.setSortTime();
	}

	// Initiates Counting Sort for 1000 ints
	public void countingSort1000() {

		List<Integer> countList1000 = nonComparisonSort.countingSort(listOf1000);
		System.out.print("\n\n\nCounting Sort 1000: ");
		System.out.println("\nCounting Sort Time: " + nonComparisonSort.getSortTime());
		nonComparisonSort.setSortTime();
	}

	// Initiates Counting Sort for 10000 ints
	public void countingSort10000() {

		List<Integer> countList10000 = nonComparisonSort.countingSort(listOf10000);
		System.out.print("\n\n\nCounting Sort 10000: ");
		System.out.println("\nCounting Sort Time: " + nonComparisonSort.getSortTime());
		nonComparisonSort.setSortTime();
	}

	// Initiates Counting Sort for 100000 ints
	public void countingSort100000() {

		List<Integer> countList100000 = nonComparisonSort.countingSort(listOf100000);
		System.out.print("\n\n\nCounting Sort 100000: ");
		System.out.println("\nCounting Sort Time: " + nonComparisonSort.getSortTime());
		nonComparisonSort.setSortTime();
	}

}
