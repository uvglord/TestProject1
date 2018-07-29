package com.uvglord.corejava.sorting.heapsort;

import java.util.Random;

public class HeapSortExample2 {

	public static void main(String[] args) {

		int size = 10;
		int[] array = new int[size];

		Random random = new Random();
		for (int i = 0; i < size; i++)
			array[i] = random.nextInt(size);

		printArray("Initial array", array);
		array = heapsort(array);
		printArray("Final   array", array);

	}

	// Sorting in non decreasing order
	public static int[] heapsort(int arr[]) {
		int N = arr.length;
		// creating a heap
		MaxHeap heap = createHeap(arr, N);

		// Repeating the below steps till the size of the heap is 1.
		while (heap.len > 1) {
			// Replacing largest element with the last item of the heap
			swap(heap, 0, heap.len - 1);
			heap.len--;// Reducing the heap size by 1
			heapify(heap, 0);
		}

		return heap.arr;
	}

	public static MaxHeap createHeap(int arr[], int N) {
		MaxHeap maxheap = new MaxHeap(N, arr);
		int i = (maxheap.len - 2) / 2;

		while (i >= 0) {
			maxheap = heapify(maxheap, i);
			i--;
		}

		return maxheap;
	}

	public static MaxHeap heapify(MaxHeap maxheap, int N) {
		int largest = N;
		int left = 2 * N + 1; // index of left child
		int right = 2 * N + 2; // index of right child

		if (left < maxheap.len && maxheap.arr[left] > maxheap.arr[largest]) {
			largest = left;
		}

		if (right < maxheap.len && maxheap.arr[right] > maxheap.arr[largest]) {
			largest = right;
		}

		if (largest != N) {
			swap(maxheap, largest, N);
			heapify(maxheap, largest);
		}

		return maxheap;
	}

	public static void swap(MaxHeap maxheap, int i, int j) {
		int temp;
		temp = maxheap.arr[i];
		maxheap.arr[i] = maxheap.arr[j];
		maxheap.arr[j] = temp;
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

	static class MaxHeap {
		int len;
		int arr[];

		MaxHeap(int l, int a[]) {
			len = l;
			arr = a;
		}
	}
}
