package com.problems;

/**
 * 
 * get mutiplication of all element except ith one for the array with same array size
 * 
 * same size =9 i= product of all elements in input array except ith one
 * 
 * //input -> i index => 2 -< value ->3 //oupt -> i idex => 2 -> value
 * 
 * 
 * 
 * @author manojkumar
 *
 */
public class GetMultiplicationOfAlliIhElements {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 6, 2, 3, -3, -5 };
		
		printArray(array);

		int[] result = new int[9];
		for (int i = 0; i < array.length; i++) {
			int product = 1;
			for (int j = 0; j < array.length; j++) {

				if (i != j) {
					product = product * array[j];
				}

			}

			result[i] = product;
		}
		
		System.out.println();
		printArray(result);
	}
	
	
	
	private static void printArray(int [] array) {
		
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+ " ");
		}
	}
	

}
