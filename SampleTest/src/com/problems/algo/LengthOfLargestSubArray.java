package com.problems.algo;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array arr[] of length N, find the length of the longest sub-array
 * with a sum equal to 0.
 * 
 * Input: arr[] = {15, -2, 2, -8, 1, 7, 10, 23} Output: 5 Explanation: The
 * longest sub-array with elements summing up-to 0 is {-2, 2, -8, 1, 7}
 * 
 * Input: arr[] = {1, 2, 3} Output: 0 Explanation: There is no subarray with 0
 * sum
 * 
 * @author manojkumar
 *
 */
public class LengthOfLargestSubArray {

	public static void main(String[] args) {

		int[] array = { 15, -2, 2, -8, 1, 7, 10, 23 };

		int sum = 0;

		bruteForceApproch(array, sum);
		solveUsingSlidingWindow(array, sum);
		solutionUsingHashing(array, sum);
	}

	public static void bruteForceApproch(int[] array, int sum) {

		int longest = Integer.MIN_VALUE;

		for (int i = 0; i < array.length; i++) {

			int sum1 = 0;

			for (int j = i; j < array.length; j++) {
				sum1 += array[j];

				if (sum1 == sum) {
					int l = (j - i) + 1;

					if (longest < l) {
						longest = l;
					}

				}
			}
		}

		System.out.println(longest);
	}

	public static void solveUsingSlidingWindow(int[] array, int sum) {

		int sum1 = 0, j = 0;
		int longestSubArraySize = 0;

		for (int i = 0; i < array.length; i++) {

			sum1 += array[i];

			if (sum1 == sum) {
				int l = i - j;

				longestSubArraySize = Math.max(longestSubArraySize, l);
				sum -= array[j];
				j++;
			}
		}

		System.out.println(longestSubArraySize);
	}

	public static void solutionUsingHashing(int[] array, int sum) {

		Map<Integer, Integer> map = new HashMap<>();
		int sum1 = 0, longest = 0;

		for (int i = 0; i < array.length; i++) {

			sum1 += array[i];

			if (sum1 == sum) {
				longest = i + 1;
			}

			if (map.containsKey(sum1)) {
				Integer sumIndex = map.get(sum1);
				longest = Math.max(longest, i - sumIndex);
			} else {
				map.put(sum1, i);
			}
		}
		
		
		System.out.println(longest);
	}

}
