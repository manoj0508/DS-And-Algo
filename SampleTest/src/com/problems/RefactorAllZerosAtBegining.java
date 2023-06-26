package com.problems;

/**
 * arrange all zero in beginning 
 * 
 * @author manojkumar
 *
 */
public class RefactorAllZerosAtBegining {

	public static void main(String[] args) {

		
		int [] array = {1,0,0,1,0,1,0};
		
		//out -> {0,0,0,0,1,1,1} o(n) 
		
		int l = array.length-1;
		for(int i=0; i<=l; i++) {
			
			if(array[i]==1) {
				
				while(array[l]!=0 && l>i) {
					l--;
				}
				
				if(array[l]==0) {
					int temp =array[i];
					array[i] = array[l];
					array[l] = temp;
				}
			}
		}
		
		
		
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
