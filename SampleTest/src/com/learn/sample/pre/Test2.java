package com.learn.sample.pre;

import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] array = new int [10];
		array[0] = 1;
		array[1]= 3;
		
		
		printArray(array);
		
		
		ArrayList<Integer> list = new ArrayList<>();
		
		System.out.println(" This array List ");
		list.add(1);
		list.add(2);
		
		
		System.out.println(list);
		
		
	}
	
	
	
	private static void printArray(int [] array ) {
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

}
