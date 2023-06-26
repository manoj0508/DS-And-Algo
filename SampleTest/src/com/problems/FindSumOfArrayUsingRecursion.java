package com.problems;

public class FindSumOfArrayUsingRecursion {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 4 };

		System.out.println(sum(array, 0));
		
	}

	
	
	public static int sum(int[] array, int i) {

		if (array.length == 0) {
			return 0;
		}

		if (i == array.length - 1) {
			return array[i];
		}

		return array[i] + sum(array, ++i);
	}

	

	
	
}
