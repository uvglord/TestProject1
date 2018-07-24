package com.uvglord.corejava.sorting.selectionsort;

import java.util.Random;

public class TestSelectionSort {

	public static void main(String[] args) {
		int size = 10;
		int[] array = new int[size];
		
		Random random = new Random();
		for(int i=0;i<size; i++)
			array[i]=random.nextInt(size);
		
		printArray("Initial array", array);
		selectionSort(array);
		printArray("Final  array ", array);
	}

	private static void selectionSort(int[] array) {
		for(int i=0; i<array.length-1; i++) {
			int index = i;
			for(int j=i+1; j<array.length; j++) 
				if(array[j]>array[index]) 
					index=j;
			swap(array, index, i);
			printArray("After  pass "+i, array);
		}
	}

	private static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	private static void printArray(String str, int[] array) {
		if(str.startsWith("Aft"))
			return;
		System.out.print(str + " : ");
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
