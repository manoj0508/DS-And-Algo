package com.problems;

public class PrintThePattern {

	/**
	 * Input: 1 Output: 1 $
	 * 
	 * Input: 2 Output: 2 2 1 1 $2 1 $
	 * 
	 * 
	 * Input: 3 Output: 3 3 3 2 2 2 1 1 1 $3 3 2 2 1 1 $3 2 1 $
	 * 
	 * 
	 * Input: 4 Output : 4 4 4 4 3 3 3 3 2 2 2 2 1 1 1 1 $ 4 4 4 3 3 3 2 2 2 1 1 1 $ 4 4 3 3 2 2 1 1 $ 4 3 2 1 $
	 * 2 1 1 $ 3 2 1 $
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		int input = 4;
		
		
      for(int k=input; k>0;k-- ) {
    	  
		for (int i = input; i > 0; i--) {
			for (int j = 1; j <= k; j++) {
				System.out.print(i + " ");
			}

			if (i == 1) {
				System.out.print("$");
			}
		}
		
      }

	}

}
