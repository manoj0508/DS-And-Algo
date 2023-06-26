package com.problems.algo;

import java.util.Stack;

public class MinimumSwapsForBracketBalancing {

	public static void main(String[] args) {
		
		String str = "]][]][][[[";

		solution(str);
		
		System.out.println(swapCount(str));
	}
	
	
	public static void solution(String str) {
		
		char[] charArray = str.toCharArray();
		
		 int swap = 0 , imbalance = 0;
		
		Stack<Character> stack = new Stack<>();
		int closeCount=0;
		
		for(int i=0; i<charArray.length; i++) {
			
			if(charArray[i]== '[') {
				stack.push(charArray[i]);
				
				if(imbalance>0) {
					swap = swap+imbalance;
					imbalance--;
				}
			}else {
				
				if(stack.isEmpty()) {
					closeCount++;
					imbalance = closeCount - stack.size();
					
				}else {
					
					Character peek = stack.peek();
					
					if(peek.equals('[')) {
						stack.pop();
					}else {
						closeCount++;
						
						imbalance = closeCount - stack.size();
					}
				}
			}
		}
		
		
		if(stack.size()==0) {
			System.out.println("it is already blanced");
		}else {
			 //swap = closeCount + stack.size();
			
			System.out.println(swap);
		}
	}
	
	
	 static long swapCount(String s)
	    {
	        char[] chars = s.toCharArray();
	         
	        // stores total number of Left and Right
	        // brackets encountered
	        int countLeft = 0, countRight = 0;
	                // swap stores the number of swaps required
	        //imbalance maintains the number of imbalance pair
	        int swap = 0 , imbalance = 0;
	         
	        for(int i =0; i< chars.length; i++)
	        {
	            if(chars[i] == '[')
	            {
	                // increment count of Left bracket
	                countLeft++;
	                if(imbalance > 0)
	                {
	                    // swaps count is last swap count + total
	                    // number imbalanced brackets
	                    swap += imbalance;
	                    // imbalance decremented by 1 as it solved
	                    // only one imbalance of Left and Right
	                    imbalance--;    
	                }
	            } else if(chars[i] == ']' )
	            {
	                // increment count of Right bracket
	                countRight++;
	                // imbalance is reset to current difference
	                // between Left and Right brackets
	                imbalance = (countRight-countLeft);
	            }
	        }
	        return swap;
	    }

}
