package com.uvglord.corejava.sorting.insertionsort;

import java.util.Random;

/*
 * Insertion sort is a simple sorting algorithm, 
 * it builds the final sorted array one item at a time. 
 * It is much less efficient on large lists than other sort algorithms. 
 */
public class TestInsertionSort {

	public static void main(String[] args) {
		int size = 10;
		int[] array = new int[size];

		Random random = new Random();
		for (int i = 0; i < size; i++)
			array[i] = random.nextInt(size);

		printArray("Initial array", array);
		doInsertSort(array);
		printArray("Final   array", array);

	}

	private static void doInsertSort(int[] array) {
		for(int i=1; i<array.length; i++) {
			for(int j=i; j>0; j--) 
				if(array[j]>array[j-1]) 
					swap(array, j-1, j);
			//printArray("After  pass "+i, array);
		}
	}

	private static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
		printArray("Interimn pass", array);
	}

	private static void printArray(String str, int[] array) {
		if (str.startsWith("Aftt"))
			return;
		System.out.print(str + " : ");
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
