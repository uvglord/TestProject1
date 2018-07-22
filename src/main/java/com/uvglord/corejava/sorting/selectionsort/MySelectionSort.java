package com.uvglord.corejava.sorting.selectionsort;

public class MySelectionSort {

	public static void main(String[] args) {
		int array[] = {1, 5, 8, 3, 2, 6, 7, 0, 4};
		printArray("Initial array", array);
		doSelectionSort(array);
		printArray("Final  array ", array);
	}
	
	public static int[] doSelectionSort(int[] arr){
        
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index]) 
                    index = j;
      
            int smallerNumber = arr[index];  
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        return arr;
    }

	private static void printArray(String str, int[] array) {
		System.out.print(str+" : ");
		for(int i :array) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
