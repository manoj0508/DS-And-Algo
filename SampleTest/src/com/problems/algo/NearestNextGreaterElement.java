package com.problems.algo;

import java.util.Stack;

/**
 * Given an array, print the Next Greater Element (NGE) for every element. The
 * Next greater element for an element x is the first greater element on the
 * right side of x in the array. The elements for which no greater element
 * exist, print -1.
 * 
 * Example Input: {1, 3, 2, 4} Output: {3, 4, 4, -1}
 * 
 * 
 * @author manojkumar
 *
 */
public class NearestNextGreaterElement extends DisplayArray{

	public static void main(String[] args) {

		int[] elements = { 6, 4, 12, 5, 2, 10 };

		bruteForceSolution(elements);
		
		System.out.println();
		optimizeSolutionWithStack(elements);
	}

	public static void bruteForceSolution(int[] array) {

		for (int i = 0; i < array.length; i++) {
			boolean found = false;
			
			if (i == array.length - 1) {
				System.out.print(-1 + " ");
				break;
			}
			
			
			for (int j = i + 1; j < array.length; j++) {

				if (array[j] > array[i]) {
					System.out.print(array[j] + " ");
					found = true;
					break;
				}
			}

			if (!found) {
				System.out.print(-1 + " ");
			}
		}
	}
	
	
	public static void optimizeSolutionWithStack(int [] array) {
		
		int[] result = new int[array.length];
		
		Stack<Integer> stack = new Stack<>();
		
		for(int i= array.length-1; i>=0; i--) {
			
			result[i] = -1;
			
			while(!stack.empty()) {
				
				Integer peek = stack.peek();
				
				if(peek> array[i]) {
					result[i] = peek;
					break;
				}else {
					stack.pop();
				}
			}
			
			stack.push(array[i]);
		}
		
		
		printArray(result);
	}
}
