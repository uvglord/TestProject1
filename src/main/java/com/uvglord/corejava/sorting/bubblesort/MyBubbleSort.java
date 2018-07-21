package com.uvglord.corejava.sorting.bubblesort;

import java.lang.reflect.Array;

public class MyBubbleSort {

	public static void main(String[] args) {
		int[] input = {4, 2, 9, 6, 23, 12, 34, 0, 1};
		printNumbers(input);
		bubbleSort(input);
	}

	//logic to sort the elements
	private static void bubbleSort(int[] input) {
		int n = input.length;
		int k;
		for(int m=n; m>=0; m--) {
			for(int i=0; i<n-1; i++) {
				k = i+1;
				if(input[i]>input[k]) {
					swapNumbers(i, k, input);
				}
			}
			printNumbers(input);
		}
		
	}

	private static void swapNumbers(int i, int k, int[] input) {
		int temp;
		temp = input[i];
		input[i] = input[k];
		input[k] = temp;
	}
	
	private static void printNumbers(int[] input) {
		for(int i=0; i<input.length; i++) {
			System.out.print(input[i]+", ");
		}
		System.out.println("\n");
		
	}
}
