package application;

import java.util.ArrayList;
import java.util.List;

public class RadixSortTester {

	NonComparisonSorting nonComparisonSort = new NonComparisonSorting();

	// Creates a new empty List<Integer> for testing
	List<Integer> testList = new ArrayList<>();
	List<Integer> listOf10 = new ArrayList<>();
	List<Integer> listOf100 = new ArrayList<>();
	List<Integer> listOf1000 = new ArrayList<>();
	List<Integer> listOf10000 = new ArrayList<>();
	List<Integer> listOf100000 = new ArrayList<>();

	// Constructor that sets the lists needed
	public RadixSortTester(List<Integer> testList, List<Integer> listOf10, List<Integer> listOf100, List<Integer> listOf1000,
			List<Integer> listOf10000, List<Integer> listOf100000) {

		this.testList = testList;
		this.listOf10 = listOf10;
		this.listOf100 = listOf100;
		this.listOf1000 = listOf1000;
		this.listOf10000 = listOf10000;
		this.listOf100000 = listOf100000;
	}
	
	// Initiates Radix Sort for test List
	public void testListSort(){
		
		List<Integer> testListSorted = nonComparisonSort.radixSort(testList);
		System.out.print("\n\n\nRadix Sort Example: \n");
		System.out.println("Orig List: " + testList);
		System.out.println("Sort List: " + testListSorted);
		System.out.println("Radix Sort Time: " + nonComparisonSort.getSortTime());
		nonComparisonSort.setSortTime();
	}

	// Initiates Radix Sort for 10 ints
	public void radixSort10() {

		List<Integer> radixList10 = nonComparisonSort.radixSort(listOf10);
		System.out.print("\n\n\nRadix Sort 10: ");
		System.out.println("\nRadix Sort Time: " + nonComparisonSort.getSortTime());
		nonComparisonSort.setSortTime();
	}

	// Initiates Radix Sort for 100 ints
	public void radixSort100() {

		List<Integer> radixList100 = nonComparisonSort.radixSort(listOf100);
		System.out.print("\n\n\nRadix Sort 100: ");
		System.out.println("\nRadix Sort Time: " + nonComparisonSort.getSortTime());
		nonComparisonSort.setSortTime();
	}

	// Initiates Radix Sort for 1000 ints
	public void radixSort1000() {

		List<Integer> radixList1000 = nonComparisonSort.radixSort(listOf1000);
		System.out.print("\n\n\nRadix Sort 1000: ");
		System.out.println("\nRadix Sort Time: " + nonComparisonSort.getSortTime());
		nonComparisonSort.setSortTime();
	}

	// Initiates Radix Sort for 10000 ints
	public void radixSort10000() {

		List<Integer> radixList10000 = nonComparisonSort.radixSort(listOf10000);
		System.out.print("\n\n\nRadix Sort 10000: ");
		System.out.println("\nRadix Sort Time: " + nonComparisonSort.getSortTime());
		nonComparisonSort.setSortTime();
	}

	// Initiates Radix Sort for 100000 ints
	public void radixSort100000() {

		List<Integer> radixList100000 = nonComparisonSort.radixSort(listOf100000);
		System.out.print("\n\n\nRadix Sort 100000: ");
		System.out.println("\nRadix Sort Time: " + nonComparisonSort.getSortTime());
		nonComparisonSort.setSortTime();
	}
}
