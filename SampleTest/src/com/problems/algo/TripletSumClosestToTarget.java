package com.problems.algo;

import java.util.Arrays;
import java.util.TreeSet;

/**
 * Problem Statement Given an array of unsorted integers a and a target, find a
 * triplet in the array whose sum is closest to the target value. Return the sum
 * of the triplet.
 * 
 * 
 * Input: a[] = [-2, -4, 6, 3, 7], target = 2 Output: 1 Explanation: Triplet
 * with sum closest to target is [-2, -4, 7], sum of the triplets = 1
 * 
 * @author manojkumar
 *
 */
public class TripletSumClosestToTarget {

	public static void main(String[] args) {

		int[] array = { -2, -4, 6, 3, 7 };

		twoPointerSoluation(array, 2);
		
		test();
	}

	public static void twoPointerSoluation(int[] array, int target) {

		Arrays.sort(array);

		int smallestDiff = Integer.MAX_VALUE;

		for (int i = 0; i < array.length - 2; i++) {

			if (i > 0 && array[i] == array[i - 1]) {
				continue;
			}

			int fixValue = array[i];

			int left = i + 1;
			int right = array.length - 1;

			while (left < right) {
				int leftValue = array[left];
				int rightValue = array[right];

				int sum = fixValue + leftValue + rightValue;

				int currentDiff = target - sum;

				if (Math.abs(currentDiff) < Math.abs(smallestDiff)) {
					smallestDiff = currentDiff;
				}

				if (currentDiff > 0) {
					left++;
				} else {
					right--;
				}
			}
		}

		System.out.println(smallestDiff);
	}

	
	public static void test() {
		TreeSet<Integer> tree = new TreeSet<>();
		
		tree.add(3);
		tree.add(4);
		tree.add(-1);
		tree.add(40);
		tree.add(-4);
		
		System.out.println(tree);
		System.out.println(tree.first());
	}
}
