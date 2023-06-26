package com.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Find the char from string who is min no of repeated.
 * 
 * e.g str = "aabbssdddddl" out -> l (l is only repeated 1 times) str =
 * "qqqwweeeee" out -> w ( w is repeated only 2 times)
 * 
 * @author manojkumar
 *
 */
public class FindMinRepeatedChar {

	public static void main(String[] args) {
		String str = "aaabbbccccdf";
		// d e

		Map<Character, Integer> map = new HashMap<>();

		char[] charArray = str.toCharArray();
		int min = Integer.MAX_VALUE;
		char r = ' ';

		for (int i = 0; i < charArray.length; i++) {

			if (map.containsKey(charArray[i])) {
				Integer v = map.get(charArray[i]);
				v = v + 1;
				if (min > v) {
					min = v;
					r = charArray[i];
				}
				map.put(charArray[i], v);
			} else {
				r = charArray[i];
				map.put(charArray[i], 1);
			}
		}

	}

}
