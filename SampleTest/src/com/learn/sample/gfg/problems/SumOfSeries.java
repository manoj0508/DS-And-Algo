package com.learn.sample.gfg.problems;

public class SumOfSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n = 12356895;
		long seriesSum = seriesSum(n);
		
		System.out.println(seriesSum);

	}
	
	public static long seriesSum(int n) {
        // code here
		
		long sum = 0; //n1 = n;
		
		 sum = ((n+1)*n)/2;
		
		return sum;
		
    }

}
