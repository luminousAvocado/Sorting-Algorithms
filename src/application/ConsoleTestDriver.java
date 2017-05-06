package application;

import java.util.ArrayList;
import java.util.List;
import java.math.BigInteger;

public class ConsoleTestDriver {

	public static void main(String[] args) {
		
		
		// Test list of size 20, with random integers of max 1000
		List<Integer> testList = new ArrayList<>();
		for(int index = 0; index < 10; index++){
			testList.add((int) Math.ceil(Math.random() * 1000));
		}
		
		
		// Creates a new empty List<Integer> for testing
		List<Integer> listOf10 = new ArrayList<>();
		List<Integer> listOf100 = new ArrayList<>();
		List<Integer> listOf1000 = new ArrayList<>();
		List<Integer> listOf10000 = new ArrayList<>();
		List<Integer> listOf100000 = new ArrayList<>();
		
		
		/*
		 * Populates list with random positive ints
		 * Bounds are from  1to 2,147,483,647
		*/
		// 10 ints
		for(int counter = 0; counter < 10; counter++){
			listOf10.add((int) Math.ceil(Math.random() * 2147483647));
		}
		// 100 ints
		for(int counter = 0; counter < 100; counter++){
			listOf100.add((int) Math.ceil(Math.random() * 2147483647));
		}
		// 1000 ints
		for(int counter = 0; counter < 1000; counter++){
			listOf1000.add((int) Math.ceil(Math.random() * 2147483647));
		}
		// 10000 ints
		for(int counter = 0; counter < 10000; counter++){
			listOf10000.add((int) Math.ceil(Math.random() * 2147483647));
		}
		// 100000 ints
		for(int counter = 0; counter < 100000; counter++){
			listOf100000.add((int) Math.ceil(Math.random() * 2147483647));
		}
		
		
		
		// Sorts all lists with Bubble Sort
		BubbleSortTester bubbleDriver = new BubbleSortTester(testList, listOf10, listOf100, listOf1000, listOf10000, listOf100000);
		bubbleDriver.testListSort();
		bubbleDriver.bubbleSort10();
		bubbleDriver.bubbleSort100();
		bubbleDriver.bubbleSort1000();
		bubbleDriver.bubbleSort10000();
		bubbleDriver.bubbleSort100000();
		
		System.out.println("\n\n\n********************************************************************");
		
		// Sorts all lists with Selection Sort
		SelectionSortTester selectionDriver = new SelectionSortTester(testList, listOf10, listOf100, listOf1000, listOf10000, listOf100000);
		selectionDriver.testListSort();
		selectionDriver.selectionSort10();
		selectionDriver.selectionSort100();
		selectionDriver.selectionSort1000();
		selectionDriver.selectionSort10000();
		selectionDriver.selectionSort100000();
		
		System.out.println("\n\n\n********************************************************************");
		
		// Sorts all lists with Insertion Sort	
		InsertionSortTester insertionDriver = new InsertionSortTester(testList, listOf10, listOf100, listOf1000, listOf10000, listOf100000);
		insertionDriver.testListSort();
		insertionDriver.insertionSort10();
		insertionDriver.insertionSort100();
		insertionDriver.insertionSort1000();
		insertionDriver.insertionSort10000();
		insertionDriver.insertionSort100000();
		
		System.out.println("\n\n\n********************************************************************");
		
		// Sorts all lists with Heap Sort
		HeapSortTester heapDriver = new HeapSortTester(testList, listOf10, listOf100, listOf1000, listOf10000, listOf100000);
		heapDriver.testListSort();
		heapDriver.heapSort10();
		heapDriver.heapSort100();
		heapDriver.heapSort1000();
		heapDriver.heapSort10000();
		heapDriver.heapSort100000();
		
		System.out.println("\n\n\n********************************************************************");
		
		// Sorts all lists with Merge Sort
		MergeSortTester mergeDriver = new MergeSortTester(testList, listOf10, listOf100, listOf1000, listOf10000, listOf100000);
		mergeDriver.testListSort();
		mergeDriver.mergeSort10();
		mergeDriver.mergeSort100();
		mergeDriver.mergeSort1000();
		mergeDriver.mergeSort10000();
		mergeDriver.mergeSort100000();
		
		System.out.println("\n\n\n********************************************************************");
		
		// Sorts all lists with Quick Sort
		QuickSortTester quickDriver = new QuickSortTester(testList, listOf10, listOf100, listOf1000, listOf10000, listOf100000);
		quickDriver.testListSort();
		quickDriver.quickSort10();
		quickDriver.quickSort100();
		quickDriver.quickSort1000();
		quickDriver.quickSort10000();
		quickDriver.quickSort100000();
		
		
		System.out.println("\n\n\n********************************************************************");
		
		
		
		
		
		
		
		// Creates lists with random integers with max of 50 million
		List<Integer> intList10 = new ArrayList<>();
		for(int index = 0; index < 10; index++){
			intList10.add((int) Math.ceil(Math.random() * 50000000));
		}
		List<Integer> intList100 = new ArrayList<>();
		for(int index = 0; index < 100; index++){
			intList100.add((int) Math.ceil(Math.random() * 50000000));
		}
		List<Integer> intList1000 = new ArrayList<>();
		for(int index = 0; index < 1000; index++){
			intList1000.add((int) Math.ceil(Math.random() * 50000000));
		}
		List<Integer> intList10000 = new ArrayList<>();
		for(int index = 0; index < 10000; index++){
			intList10000.add((int) Math.ceil(Math.random() * 50000000));
		}
		List<Integer> intList100000 = new ArrayList<>();
		for(int index = 0; index < 100000; index++){
			intList100000.add((int) Math.ceil(Math.random() * 50000000));
		}
		
		
		
		// Sorts all lists with Counting Sort
		CountingSortTester countDriver = new CountingSortTester(testList, intList10, intList100, intList1000, intList10000, intList100000);
		countDriver.testListSort();
		countDriver.countingSort10();
		countDriver.countingSort100();
		countDriver.countingSort1000();
		countDriver.countingSort10000();
		countDriver.countingSort100000();
		
		System.out.println("\n\n\n********************************************************************");
		
		// Sorts all lists with Radix Sort
		RadixSortTester radixDriver = new RadixSortTester(testList, intList10, intList100, intList1000, intList10000, intList100000);
		radixDriver.testListSort();
		radixDriver.radixSort10();
		radixDriver.radixSort100();
		radixDriver.radixSort1000();
		radixDriver.radixSort10000();
		radixDriver.radixSort100000();
	}
}
