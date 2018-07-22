package com.uvglord.corejava.sorting.bubblesort;

public class BubbleSortOptimised {

	public static void main(String[] args) {
		// Initialize arr
		int arr[] = { 10, 7, 3, 1, 9, 7, 4, 3 };
		System.out.print("Initial Array : ");
		printArray(arr);
		bubbleSort(arr);
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();
	}

	/*
	 * This method will not evaluate further loops, 
	 * if the list is sorted in earlier loops
	 */
	 
	static void bubbleSort(int[] arr) {
		boolean sorted  = false;
		for (int i = 0; i < arr.length; i++) {
			sorted = false;
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					sorted = true;
				}
			}
			if(!sorted) {
				break;
			}
			System.out.print("After pass " + i + "  : ");
			// Printing array after pass
			printArray(arr);
		}
	}
}
