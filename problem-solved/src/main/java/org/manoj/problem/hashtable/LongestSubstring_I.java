package org.manoj.problem.hashtable;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Given a string s, find the length of the longest substring without duplicate characters.
 *
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.
 *
 */
public class LongestSubstring_I {

    public static void main(String[] args){
        String input = "pwwkew";
        System.out.println(lengthOfLongestSubstring(input));

        System.out.println(enhancedCodeWithBetterReadbility(input));
    }

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new LinkedHashSet<>();
        int max_length =0,count=0;
        for(int i=0; i<s.length(); i++){
            while(set.contains(s.charAt(i))){
                if(count>=max_length){
                    max_length = count;
                }
                Character next = set.iterator().next();
                set.remove(next);
                count--;
            }
            set.add(s.charAt(i));
            count++;
        }

        if(count>=max_length){
            max_length = count;
        }
        return max_length;
    }

    //Using Sliding window technique
    public static int enhancedCodeWithBetterReadbility(String s){
            Set<Character> set = new HashSet<>();
            int max_length =0,left=0;
            for(int i=0; i<s.length(); i++){
                while(set.contains(s.charAt(i))){
                    set.remove(s.charAt(left));
                    left++;
                }
                set.add(s.charAt(i));
               max_length=Math.max(max_length,i-left+1);
            }

            return max_length;

    }
}
