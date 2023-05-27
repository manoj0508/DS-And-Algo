package com.learn.sample.gfg.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ReverseArrayOfGroup {

	public static void main(String[] args) {

		List<Integer> asList = Arrays.asList(1, 2, 3, 4,5,6,7,8,9,2,3,4,5,5);
		ArrayList<Integer> arr = new ArrayList<>();
		arr.addAll(asList);
		int n = 5, k = 3;

		reverseInGroups(arr, n, k);

		System.out.println(arr);
	}

	public static void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
		
		for(int i=0; i<n; i+=k) {
			int start = i;
			int end = Math.min(start+k-1, n-1);
			
			reverArray(arr, start, end);
		}
	}
	
	public static void reverArray(ArrayList<Integer> arr, int start, int end) {
		
		while(start <= end) {
			Collections.swap(arr, start, end);
			start++;
			end--;
		}
	}

}
