package com.problems;

public class FindTheMaxAndMinValueInArray {

	public static void main(String[] args) {
		int[] values = {5,-2147483648, 1,2147483647, 2};
		
        int smallest = values[0];
        int largest  = values[0];
        
        for (int value : values) {
            if (value < smallest) {
                smallest = value;
            } 
            if (value > largest) {
                largest = value;
            }
        }
        System.out.println(smallest + ", " + largest);

	}

}
