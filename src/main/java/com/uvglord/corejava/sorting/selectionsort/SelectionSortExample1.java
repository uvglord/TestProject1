package com.uvglord.corejava.sorting.selectionsort;

public class SelectionSortExample1 {

	public static void main(String[] args) {
		int array[] = {1, 5, 8, 3, 2, 6, 7, 0, 4};
		printArray("Initial array", array);
		selectionSort(array);
		printArray("Final  array ", array);
	}
	
	private static void selectionSort(int[] array) {
		for(int j=0; j<array.length; j++) {
			int index = j;
			for(int k=j+1; k<array.length; k++) {
				if(array[k]>array[index]) {
					index = k;
				}
			}
			int temp = array[index];
			array[index] = array[j];
			array[j] = temp;
		}
	}

	private static void printArray(String str, int[] array) {
		System.out.print(str+" : ");
		for(int i :array) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
