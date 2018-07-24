package com.uvglord.corejava.sorting.bubblesort;

import java.util.Random;

public class TestBubbleSort {

	public static void main(String[] args) {
		int size = 10;
		int[] array = new int[size];
		
		Random random = new Random();
		for(int i=0;i<size; i++)
			array[i]=random.nextInt(size);
		
		printArray("Initial array", array);
		sort(array);
		printArray("Final   array", array);
	}

	private static void sort(int[] array) {
		for(int i=0;i<array.length-1;i++) {
			for(int j=i+1;j<array.length;j++)
				if(array[i]<array[j])
					swap(array, i, j);
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
