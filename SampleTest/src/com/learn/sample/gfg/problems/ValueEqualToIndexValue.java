package com.learn.sample.gfg.problems;

import java.util.ArrayList;
import java.util.List;

public class ValueEqualToIndexValue {

	public static void main(String[] args) {
		
		int[] arr = {1,335, 501, 170, 725, 479, 359, 963, 465, 706, 146, 12, 828, 962, 492, 996, 943, 828, 437, 392, 605,
				903, 154, 293, 383, 422, 717, 719, 896, 448, 727, 772, 539, 870, 913, 668, 300, 36, 895, 704, 812, 323};
		int n = 42;

		ArrayList<Integer> valueEqualToIndex = valueEqualToIndex(arr, n);
		System.out.println(valueEqualToIndex);
	
	}

	public static ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        // code here
		ArrayList<Integer> result = new ArrayList<>();
		
		for(int i=0; i<arr.length; i++) {
			int j = i+1;
			if(arr[i]==j) {
				result.add(arr[i]);
			}
		}
		
		
		
		return result;
    }
}
