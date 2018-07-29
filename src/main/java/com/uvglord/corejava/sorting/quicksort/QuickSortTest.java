package com.uvglord.corejava.sorting.quicksort;

import java.util.Random;
/*
 * Quicksort or partition-exchange sort, is a fast sorting algorithm, 
 * which is using divide and conquer algorithm. 
 * Quicksort first divides a large list into two smaller sub-lists: 
 * the low elements and the high elements. 
 * Quicksort can then recursively sort the sub-lists.
 */
public class QuickSortTest {

	private static int array[];

	public static void main(String[] args) {
		int size = 10;
		int[] array = new int[size];

		Random random = new Random();
		for (int i = 0; i < size; i++)
			array[i] = random.nextInt(size);

		printArray("Initial array", array);
		sort(array);
		printArray("Final   array", array);

	}

	public static void sort(int[] inputArr) {
		array = inputArr;
		doQuickSort(0, inputArr.length - 1);
	}

	private static void doQuickSort(int lowerIndex, int higherIndex) {
		int i=lowerIndex;
		int j=higherIndex;
		int pivot=array[lowerIndex+(higherIndex-lowerIndex)/2];
		
		while(i<=j) {
			while(array[i]<pivot)
				i++;
			while(array[j]>pivot)
				j--;
			
			if(i<=j) {
				swap(i, j);
				i++;
				j--;
			}
		}
		if(j>lowerIndex)
			doQuickSort(lowerIndex, j);
		if(i<higherIndex)
			doQuickSort(i, higherIndex);
		
	}

	private static void swap(int i, int j) {
		if(i==j)
			return;
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
		printArray("Interimn pass", array);
	}

	private static void printArray(String str, int[] array) {
		if (str.startsWith("Fin"))
			return;
		System.out.print(str + " : ");
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
