package com.uvglord.corejava.sorting.mergesort;

public class MyMergeSort2 {
	private int[] array;
	private int[] tempMergArr;
	private int length;

	public static void main(String a[]) {

		int[] inputArr = { 45, 23, 11, 89, 77, 98, 4, 28, 65, 43 };
		MyMergeSort2 mms = new MyMergeSort2();
		mms.sort(inputArr);
		for (int i : inputArr) {
			System.out.print(i);
			System.out.print(" ");
		}
	}

	public void sort(int inputArr[]) {
		this.array = inputArr;
		this.length = inputArr.length;
		this.tempMergArr = new int[length];
		doMergeSort(0, length - 1);
	}

	private void doMergeSort(int lowerIndex, int higherIndex) {

		if (lowerIndex < higherIndex) {
			int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
			// Below step sorts the left side of the array
			doMergeSort(lowerIndex, middle);
			// Below step sorts the right side of the array
			doMergeSort(middle + 1, higherIndex);
			// Now merge both sides
			mergeParts(lowerIndex, middle, higherIndex);
		}
	}

	private void mergeParts(int lowerIndex, int middle, int higherIndex) {

		for (int i = lowerIndex; i <= higherIndex; i++) {
			tempMergArr[i] = array[i];
		}
		int i = lowerIndex;
		int j = middle + 1;
		int k = lowerIndex;
		while (i <= middle && j <= higherIndex) {
			if (tempMergArr[i] <= tempMergArr[j]) {
				array[k] = tempMergArr[i];
				i++;
			} else {
				array[k] = tempMergArr[j];
				j++;
			}
			k++;
		}
		while (i <= middle) {
			array[k] = tempMergArr[i];
			k++;
			i++;
		}

	}
}

/*
Merge sort

[45, 23, 11, 89, 77, 98, 4, 28, 65, 43]

0 9
	0 4
		0 2
			0 1
				0 0
				1 1
				m(0, 1, 1) -> [23, 45, 11, 89, 77, 98, 4, 28, 65, 43]
			2 2
			m(0, 1, 2) -> [11, 23, 45, 89, 77, 98, 4, 28, 65, 43]
		3 4
			3 3
			4 4
			m(3, 3, 4) -> [11, 23, 45, 77, 89, 98, 4, 28, 65, 43]
		m(0, 2, 4) -> [11, 23, 45, 77, 89, 98, 4, 28, 65, 43]
	5 9
		5 7
			5 6
				5 5
				6 6
				m(5, 5, 6) -> [11, 23, 45, 77, 89, 4, 98, 28, 65, 43]
			7 7
			m(5, 6, 7) -> [11, 23, 45, 77, 89, 4, 28, 98, 65, 43]
		8 9
			8 8
			9 9
			m(8, 8, 9) -> [11, 23, 45, 77, 89, 4, 28, 98, 43, 65]
		m(5, 7, 9) -> [11, 23, 45, 77, 89, 4, 28, 43, 65, 98]
	m(0 5 9) -> [4, 11, 23, 28, 43, 45, 65, 77, 89, 98]
	
*/