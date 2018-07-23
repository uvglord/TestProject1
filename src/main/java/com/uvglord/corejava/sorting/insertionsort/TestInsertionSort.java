package com.uvglord.corejava.sorting.insertionsort;

import java.util.Random;

public class TestInsertionSort {

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

	private static void sort(int[] array) {
		int count=0;
		for(int i=1; i<array.length; i++) {
			for(int j=i;j>0; j--) {
				count++;
				if(array[j]<array[j-1]) {
					swap(array, j-1, j);
				}else {
					break;
				}
			}
			printArray("After  pass "+i, array);
		}
		System.out.println("Total evaluations "+count);
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
