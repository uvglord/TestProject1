package com.uvglord.corejava.sorting.bubblesort;

public class TestBubbleSort {

	public static void main(String[] args) {
		int array[] = {2, 4, 6, 3, 5, 5, 6, 9, 0, 1};
		printArray("Initial array", array);
		sort(array);
	}

	private static void sort(int[] array) {
		int i = array.length;
		boolean sorted;
		for(int j=0;j<i;j++) {
			sorted = false;
			for(int k=j+1; k<i; k++) {
				if(array[k]>array[j]) {
					swap(array, k, j);
					sorted = true;
					//printArray("\t intermediate"+j, array);
				}
			}
			//if(!sorted)
				//break;
			printArray("After pass  "+j, array);
		}
		
	}

	private static void swap(int[] array, int k, int j) {
		int temp = array[k];
		array[k] = array[j];
		array[j] = temp;
	}

	private static void printArray(String str, int[] array) {
		System.out.print(str+" : ");
		for(int i :array) {
			System.out.print(i+" ");
		}
		System.out.println();
	}

}
