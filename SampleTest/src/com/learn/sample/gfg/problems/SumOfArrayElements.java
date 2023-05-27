package com.learn.sample.gfg.problems;

public class SumOfArrayElements {

	public static void main(String[] args) {
	
		int[] arr = {2,3,4,5,6,7,8,9};
		int n = 8;
		
		int sumElement = sumElement(arr, n);
		
		System.out.println(sumElement);
		
		

	}
	
	public static int sumElement(int arr[], int n)
    {
       int sum = 0;
		for(int i=0; i<n; i++) {
			sum +=arr[i];
		}
		
		return sum;
    }

}
