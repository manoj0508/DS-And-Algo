package com.problems.algo;

/**
 * 
 * Problem Statement: Maximum Sum Subarray of Size K Given an array of positive
 * integers, and a positive number k, find the maximum sum of any contiguous
 * subarray of size k.
 * 
 * 
 * 
 * 
 * Input: [3, 5, 2, 1, 7], k=2 Output: 8 Explanation: Subarray with maximum sum
 * is [1, 7].
 * 
 * Input: a[] = {4, 2, 3, 5, 1, 2}, k = 3 Output: 10 Explanation: Subarray with
 * maximum sum is [2, 3, 5]
 * 
 * 
 * 
 * @author manojkumar
 *
 */
public class MaximumSumSubarrayOfSizeK {

	public static void main(String[] args) {

		// int[] array = { 3, 5, 2, 1, 7 };
		// int k = 2;

		int[] array = { 4, 2, 3, 5, 1, 2 };
		int k = 3;

		bruteForceSolution(array, k);

		optimizeSolutionUsingSlidingWindow(array, k);

		optimizeSolutionUsingSlidingWindow2(array, k);
	}

	/**
	 * this is O(n*K)
	 * 
	 * @param array
	 * @param k
	 */
	public static void bruteForceSolution(int[] array, int k) {

		int maxSum = Integer.MIN_VALUE;

		for (int i = 0; i < array.length - k; i++) {
			int sum = array[i];
			int count = 1, j = i + 1;
			while (count < k) {

				sum = sum + array[j];
				j++;
				count++;
			}

			if (sum > maxSum) {
				maxSum = sum;
			}
		}

		System.out.println(maxSum);

	}

	public static void optimizeSolutionUsingSlidingWindow(int[] array, int k) {

		int sum = 0;
		int maxSum = Integer.MIN_VALUE;

		for (int i = 0; i < k; i++) {
			sum = sum + array[i];
		}
		maxSum = sum;

		int j = 0;
		for (int i = k; i < array.length; i++) {

			sum = sum + array[i];
			sum = sum - array[j];

			if (sum > maxSum) {
				maxSum = sum;
			}
			j++;
		}

		System.out.println(maxSum);
	}

	public static void optimizeSolutionUsingSlidingWindow2(int[] array, int k) {

		int sum = 0, maxSum = Integer.MIN_VALUE, startWindow = 0;

		for (int i = 0; i < array.length; i++) {

			sum += array[i];

			if (i - startWindow + 1 == k) {
				maxSum = Math.max(maxSum, sum);
				sum = sum - array[startWindow];
				startWindow++;
			}
		}

		System.out.println(maxSum);
	}

}
