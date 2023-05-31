package com.problems.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array of unsorted numbers, find all unique triplets in the array
 * whose sum is zero. The array may have duplicates.
 * 
 * Input: a[] = [-5, 3, 2, -3, 1] 
 * Output: [-5, 3, 2] [2, -3, 1]
 * 
 * @author manojkumar
 *
 */
public class FindAllTripletsWithZeroSum {

	public static void main(String[] args) {

		int[] array = { -1, -1, 2, -1, -1, 2, -1, -1, 2 };
		twoPointerSoluation(array);
	}

	public static void twoPointerSoluation(int[] array) {

		Arrays.sort(array);
		List<List<Integer>> result = new ArrayList<>();
		
		for(int i=0; i<array.length-2; i++) {
			
			if(i>0 && array[i]== array[i-1]) {
				continue;
			}
			int fixValue = array[i];
			
			int left = i+1;
			int right = array.length-1;
			
			while(left<right) {
				int leftValue = array[left];
				int rightValue = array[right];
				int sum = fixValue + leftValue + rightValue;
				if(sum ==0) {
					result.add(Arrays.asList(fixValue, leftValue, rightValue));
					left++; right --;
				
				
				while(left<right && array[left]==array[left-1]) {
					left++;
				}
				
				while(left<right && array[right]== array[right+1]) {
					right--;
				}
			}else if(sum<0) {
				left++;
			}else {
				right--;
			}
			}
		}
		
		System.out.println(result);
	}

}
