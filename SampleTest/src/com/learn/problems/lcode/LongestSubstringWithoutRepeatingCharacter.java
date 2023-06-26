package com.learn.problems.lcode;

import java.util.HashSet;

/**
 * 
 * Given a string s, find the length of the longest substring without repeating
 * characters.
 * 
 * 
 * 
 * 
 * Input: s = "abcabcbb" Output: 3 Explanation: The answer is "abc", with the
 * length of 3.
 * 
 * 
 * 
 * Input: s = "bbbbb" Output: 1 Explanation: The answer is "b", with the length
 * of 1.
 * 
 * 
 * 
 * Input: s = "pwwkew" Output: 3 Explanation: The answer is "wke", with the
 * length of 3. Notice that the answer must be a substring, "pwke" is a
 * subsequence and not a substring.
 * 
 * 
 * @author manojkumar
 *
 */
public class LongestSubstringWithoutRepeatingCharacter {

	public static void main(String[] args) {

		String input = "pwwkew";

		bruteForceApproch(input);
		
		optimizeSolution1(input);
	}

	public static void bruteForceApproch(String input) {

		char[] charArray = input.toCharArray();
		int longest = 0;

		for (int i = 0; i < charArray.length; i++) {

			HashSet<Character> set = new HashSet<>();
			for (int j = i; j < charArray.length; j++) {

				if (set.contains(charArray[j])) {
					if (longest < set.size()) {
						longest = set.size();
						break;
					}

				} else {
					set.add(charArray[j]);
				}
			}
		}

		System.out.println("brute Froce " +longest);
	}

	public static void optimizeSolution1(String input) {

		char[] charArray = input.toCharArray();
		HashSet<Character> set = new HashSet<>();
		int longest = 0;
		
		for (int i = 0; i < charArray.length; i++) {

			if(set.contains(charArray[i])) {
				
				if(longest< set.size()) {
					longest = set.size();
				}
				
				set.remove(charArray[i]);
				set.add(charArray[i]);
				
			}else {
				set.add(charArray[i]);
			}
		}
		
		
		
		System.out.println("Optimize Solution : "+ longest);
	}
}
