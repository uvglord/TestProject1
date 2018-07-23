package com.uvglord.corejava.sorting.quicksort;

public class MyQuickSort2 {
    
    private static int array[];

    public static void main(String a[]){
        int[] input = {24,2,45,20,56,75,2,56,99,53,12};
        printArray("Initial array", input);
        sort(input);
        printArray("Final   array", input);
    }
    
    public static void sort(int[] inputArr) {
        array = inputArr;
        quickSort(0, inputArr.length - 1);
    }
 
    private static void quickSort(int lowerIndex, int higherIndex) {
        int i = lowerIndex;
        int j = higherIndex;
        // calculate pivot number, I am taking pivot as middle index number
        int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
        // Divide into two arrays
        while (i <= j) {
            /**
             * In each iteration, we will identify a number from left side which 
             * is greater then the pivot value, and also we will identify a number 
             * from right side which is less then the pivot value. Once the search 
             * is done, then we exchange both numbers.
             */
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
        if (lowerIndex < j)
            quickSort(lowerIndex, j);
        if (i < higherIndex)
            quickSort(i, higherIndex);
    }
 
    private static void exchangeNumbers(int i, int j) {
    	if(i==j)
    		return;
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        printArray("Interim array", array);
    }
    
    private static void printArray(String str, int[] array) {
		if(str.startsWith("Fin"))
			return;
		System.out.print(str + " : ");
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
