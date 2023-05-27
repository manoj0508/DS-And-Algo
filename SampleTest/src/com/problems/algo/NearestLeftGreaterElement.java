package com.problems.algo;

import java.util.Stack;

import com.learn.sample.DisplayArray;

/**
 * Nearest greater element to the left of every element
 * 
 * @author manojkumar
 *
 *         Given an array of integers, find the nearest (not considering
 *         distance, but value) greater element to the left of every element.
 *         The elements for which no greater element exists on the left side,
 *         print -1.
 */
public class NearestLeftGreaterElement extends DisplayArray{

	public static void main(String[] args) {

		int[] array = { 9, 4, 15, 6, 2, 10 };

		brutForceSolution(array);
		
		System.out.println();
		optimizedUsingStack(array);
		
		
	}
	
	
	
	public static void brutForceSolution(int[] array ) {
		for (int i = 0; i < array.length; i++) {
			boolean found = false;
			for (int j = i-1; j >= 0; j--) {

				if(array[j]>array[i]) {
					System.out.print(array[j]+ " ");
					found= true;
					break;
				}
			}
			
			if(!found) {
				System.out.print(-1 + " ");
			}
		}
	}
	
	
	public static void optimizedUsingStack(int [] array) {
		
		Stack<Integer> stack = new Stack<>();
		int [] result = new int[array.length];
		
		for(int i =0; i<array.length; i++) {
			result[i] = -1;
			
			while(!stack.isEmpty()) {
				
				Integer top = stack.peek();
				
				if(top>array[i]) {
					result[i] = top;
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
