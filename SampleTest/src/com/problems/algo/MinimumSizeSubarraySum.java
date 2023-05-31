package com.problems.algo;

/**
 * 
 * Problem statement Given an array of positive integers a and a positive number
 * K, find the length of the smallest contiguous subarray whose sum is greater
 * than or equal to K. Return 0 if no such subarray exists.
 * 
 * 
 * Input: a = [2, 1, 4, 3, 2, 5], K = 7 Output: 2 Explanation: The smallest
 * subarray with a sum greater than or equal to '7' is [4, 3]
 * 
 * @author manojkumar
 *
 */
public class MinimumSizeSubarraySum {

	public static void main(String[] args) {

		int[] array = { 3, 4, 1, 1, 6 };
		int targetSum = 2;
		bruteForeSoluation(array, targetSum);

	}

	public static void bruteForeSoluation(int[] array, int targetSum) {

		int smallestArraySize = Integer.MAX_VALUE;

		for (int i = 0; i < array.length; i++) {
			int sum = 0;

			for (int j = i; j < array.length; j++) {

				sum += array[j];
				if (sum >= targetSum) {
					smallestArraySize = Math.min(smallestArraySize, j - i + 1);
					break;
				}

			}
		}

		System.out.println(smallestArraySize);
	}

	public static void optimizeSolutionUsingSlidingWindow(int[] array, int targetSum) {

		int smallesArraySize = Integer.MAX_VALUE;

		int j = 0, sum = 0;

		for (int i = 0; i < array.length; i++) {
			sum += array[i];
			
			if (sum >= targetSum) {
				smallesArraySize = Math.min(smallesArraySize, i - j + 1);
				sum -= array[j];
				j++;
			}
		}

		System.out.println(smallesArraySize);
	}
}
