package com.problems.algo;

/**
 * Given a string, find the length of the longest possible substring in it that
 * has exactly K distinct characters. If there is no possible substring then
 * print -1.
 * 
 * You can assume that K is less than or equal to the length of the given
 * string.
 * 
 * 
 * eg : Input: S = "aabacbebebe", K = 3 Output: 7 Explanation: "cbebebe" is the
 * longest substring with 3 distinct characters.
 * 
 * @author manojkumar
 *
 */
public class LongestSubstringWithKdistinctCharacters {

	public static void main(String[] args) {

		String s = "aabacbebebe";
		int k =3;
		
	}

	
	
	public static void bruteForceSolution(String s, int k) {
		char[] charArray = s.toCharArray();
		StringBuilder str = new StringBuilder();
		
		for(int i=0; i<charArray.length-k; i++) {
			
			for(int j=i; j<charArray.length; j++) {
			
				if(charArray[i] == charArray[j]) {
					break;
				}
			}
		}
		
	}
}
