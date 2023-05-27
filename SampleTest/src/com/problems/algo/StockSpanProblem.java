package com.problems.algo;

import java.util.Stack;

/**
 * Problem Statement
 * 
 * The stock span problem is a financial problem where we have a series of n
 * daily price quotes for a stock and we need to calculate span of stock’s price
 * for all n days.
 * 
 * The span S[i] of the stock’s price on a given day i is defined as the maximum
 * number of consecutive days (starting from today and going backward) for which
 * the stock price was less than or equal to its price on day i.
 * 
 * For example, if the price of a stock over a period of 7 days are [100, 80,
 * 60, 70, 60, 75, 85], then the stock spans would be [1, 1, 1, 2, 1, 4, 6].
 * 
 * 
 * @author manojkumar
 *
 */
public class StockSpanProblem {

	public static void main(String[] args) {

		int [] stockPrice = {100, 80, 60, 70, 60, 75, 85, 80};
		
		bruteForceSolution(stockPrice);
		
		System.out.println();
		//optimizeSolutionWithStack(stockPrice);
	}
	
	
	public static void bruteForceSolution(int [] array) {
		
		for(int i=0; i<array.length; i++) {
			int count =0;
			for(int j = i; j>=0; j--) {
				
				if(array[j]<= array[i]) {
					count++;
				}else {
					break;
				}
			}
			
			System.out.print(count + " ");
		}
	}
	


}
