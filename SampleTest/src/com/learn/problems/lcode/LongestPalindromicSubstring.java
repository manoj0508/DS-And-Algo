package com.learn.problems.lcode;

public class LongestPalindromicSubstring {

	public static void main(String[] args) {

		String str = "babadffffmadam";

		solution1(str);
	}

	public static void solution1(String str) {

		char[] charArray = str.toCharArray();

		int l = charArray.length;
		String subStr = "";

		for (int i = 0; i < l - 1; i++) {
			for (int j = i + 1; j < l; j++) {
				if (isPalindrom(charArray, i, j)) {
					int subLength = (j - i)+1;
					if (subStr.length() < subLength) {
						subStr = str.substring(i, j+1);
					}
				}
			}

			
		}
		
		
		System.out.println(subStr);

	}

	public static boolean isPalindrom(char[] charArray, int start, int end) {

		while (start <= end) {

			if (charArray[start] == charArray[end]) {
				start++;
				end--;
			} else {
				return false;
			}
		}

		return true;
	}

}
