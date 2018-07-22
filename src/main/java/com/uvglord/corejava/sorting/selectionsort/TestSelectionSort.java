package com.uvglord.corejava.sorting.selectionsort;

public class TestSelectionSort {

	public static void main(String[] args) {
		int[] array = { 5, 3, 4, 6, 2, 8, 1, 9, 7 };
		printArray("Initial array", array);
		selectionSort(array);
		printArray("Final  array ", array);
	}

	private static void selectionSort(int[] array) {
		for(int i=0; i<array.length; i++) {
			int index = i;
			for(int j=i+1; j<array.length; j++) {
				if(array[j]>array[index]) {
					index=j;
				}
			}
			int temp = array[index];
			array[index] = array[i];
			array[i] = temp;
		}

	}

	private static void printArray(String str, int[] array) {
		System.out.print(str + " : ");
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
