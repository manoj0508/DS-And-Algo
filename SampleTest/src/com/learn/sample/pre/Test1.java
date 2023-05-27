package com.learn.sample.pre;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test1 {

	public static void main(String[] args) {

		int[] arr = { 10, 7, 8, 9, 1, 5 };
		int n = arr.length;
		quickSort(arr, 0, n - 1);
		printArray(arr, n);
		
		
		   

	}

	public static void quickSort(int[] arr, int low, int high) {

		if (low < high) {
			int pi = partition(arr, low, high);

			quickSort(arr, low, pi - 1);
			quickSort(arr, pi + 1, high);
		}

	}

	private static int partition(int[] arr, int low, int high) {
		// TODO Auto-generated method stub

		int pivot = arr[high];
		int j = (low - 1);
		for (int i = low; i < high; i++) {
			if (pivot > arr[i]) {

				j++;
				swap(arr, j, i);

			}
		}
		swap(arr, j + 1, high);
		return (j + 1);
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	static void printArray(int[] arr, int size) {
		for (int i = 0; i < size; i++)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

}
