package com.learn.sample.gfg.problems;

import java.util.ArrayList;

public class SubArrayWithGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5, s = 12;
		int[] arr = {1,2,3,7,5};
		
		ArrayList<Integer> list = solution1(n, s, arr);
		
		ArrayList<Integer> solution2 = solution2(n, s, arr);
		
		
		System.out.println(list);
		
		System.out.println(" Solution2 : "+ solution2);
				
	}
	
	private static ArrayList<Integer> solution2(int n, int s, int[] arr) {
		ArrayList<Integer> list = new ArrayList<>();
		
		int currentSum = arr[0], start=0,i;
		
		for(i=1; i<=n; i++) {
			
			while(currentSum>s && start< i-1) {
				currentSum -=arr[start];
				start++;
			}
			
			if(currentSum == s) {
				int p = i-1;
				 list.add(++start); list.add(++p);
				break;
			}

			if(i<n) {
				currentSum += arr[i];
			}
			
			
		}
		if(list.size()==0) {
			list.add(-1);
		}
		
		return list;
	}

	private static ArrayList<Integer> solution1(int n, int s, int[] arr) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0; i<n; i++) {
			int tempSum = arr[i];
			if(s == tempSum) {
				list.add(++i); list.add(i);
				break;
			}
			for(int j=i+1; j<n; j++) {
				tempSum = tempSum + arr[j];
				
				if(s == tempSum) {
					list.add(++i); list.add(++j);
					break;
				}
			}
			
			if(list.size()>0) {
				break;
			}
		}
		
		if(list.size() ==0) {
			list.add(-1);
		}
		return list;
	}

}
