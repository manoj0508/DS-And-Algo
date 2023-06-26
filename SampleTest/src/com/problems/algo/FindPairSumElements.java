package com.problems.algo;

import java.util.HashMap;
import java.util.Map;

/*
 * Given an array of distinct integers, find if there are two pairs (a, b) and (c, d) 
such that a+b = c+d, and a, b, c and d are distinct elements. If there are multiple answers, 
then print any of them.  

 


Input:   {3, 4, 7, 1, 2, 9, 8}
Output:  (3, 8) and (4, 7)
Explanation: 3+8 = 4+7  

 


Input:   {3, 4, 7, 1, 12, 9};
Output:  (4, 12) and (7, 9)
Explanation: 4+12 = 7+9  

 


Input:  {65, 30, 7, 90, 1, 9, 8};
Output:  No pairs found
 */
public class FindPairSumElements {

	public static void main(String[] args) {

		int[] array = { 3, 4, 7, 1, 2, 9, 8 };

		solution1UsingHashing(array);

		solution2UsingHashing(array);
	}

	/**
	 * Below are implementations of the above idea. In the below implementation, the
	 * map is used instead of a hash. The time complexity of map insert and search
	 * is actually O(Log n) instead of O(1). So below implementation is O(n2 Log n).
	 * 
	 * @param array
	 */
	public static void solution1UsingHashing(int[] array) {

		Map<Integer, String> remainingElement = new HashMap<>();

		for (int i = 0; i < array.length - 1; i++) {
			int firstElement = array[i];
			for (int k = i + 1; k < array.length; k++) {
				int secondElement = array[k];
				int sum = firstElement + secondElement;

				if (remainingElement.containsKey(sum)) {
					String pair1 = remainingElement.get(sum);
					System.out.println("pair " + pair1 + " " + firstElement + " " + secondElement);
					return;
				} else {
					String pair = firstElement + " " + secondElement;
					remainingElement.put(sum, pair);
				}

			}
		}

		System.out.println("No pair found");
	}

	
	
	
	
	/**
	 * This method will print all possible pair with same sum value
	 * 
	 * @param array
	 */
	public static void solution2UsingHashing(int[] array) {

		Map<Integer, String> sumOfElements = new HashMap<>();

		for (int i = 0; i < array.length - 1; i++) {
			int firstElement = array[i];
			for (int k = i + 1; k < array.length; k++) {
				int secondElement = array[k];
				int sum = firstElement + secondElement;

				if (sumOfElements.containsKey(sum)) {
					String pair1 = sumOfElements.get(sum);
					System.out.println("pair " + pair1 + " " + firstElement + " " + secondElement);
					sumOfElements.remove(sum);
				} else {
					String pair = firstElement + " " + secondElement;
					sumOfElements.put(sum, pair);
				}

			}

			if (i == array.length - 2) {
				return;
			}
		}

		System.out.println("No pair found");
	}

}
