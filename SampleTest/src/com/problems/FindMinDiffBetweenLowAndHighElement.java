package com.problems;

import java.util.Arrays;

public class FindMinDiffBetweenLowAndHighElement {

	/**
	 * 
	 * 
	 * list of array = {7,9,2,4,14,8,12} 
	 * 
	 *  divide the above list element in n such that difference between lowest element and high element is min
	 * 
	 * Example :
	 * {2,4,7,8,9,12,14}
	 * 
	 * n = 3 => 5,4,2,4,5 => 2
	 * 
	 * if we have {7,8,9} difference = 9-7 = 2 (this is lowest)
	 * 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 7, 23, 2, 4, 14, 8, 12 };
		int n = 3;

		// 2,4,7,8,12,14,23
		
		// 5,4,5,6
		Arrays.sort(array);

		int min = Integer.MAX_VALUE;

		if (n == 1) {
			System.out.println(array[0]);
			
		} else if (n <= array.length) {
			int j = 0, k = n - 1;

			while (k < array.length) {

				int diff = array[k] - array[j];

				if (diff < min) {
					min = diff;
				}

				k++;
				j++;
			}
			System.out.println(min);
		} else {
			System.out.println("n is high");
		}

	}

}
