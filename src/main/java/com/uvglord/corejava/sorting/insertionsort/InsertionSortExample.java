package com.uvglord.corejava.sorting.insertionsort;

public class InsertionSortExample {

	public static void main(String[] args) {
		//int[] array = { 9, 0, 0, 3, 0, 5, 0, 6, 1, 5 };
		//int[] array = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] array = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
		printArray("Initial array", array);
		sort(array);
		printArray("Final   array", array);

	}

	private static void sort(int[] array) {
		int opCount = 0;
		for (int i = 1; i < array.length; i++) {
			for (int j = i; j > 0; j--) {
				opCount++;
				if (array[j] < array[j - 1]) {
					swap(array, j - 1, j);
				} else {
					break;
				}
			}
			printArray("After  pass " + i, array);
		}
		System.out.println("total evaluaitons " + opCount);
	}

	private static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	private static void printArray(String str, int[] array) {
		if (str.startsWith("Aft"))
			return;
		System.out.print(str + " : ");
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}