package com.learn.string.problems;

public class LongestCommonPrefix {

	public static void main(String[] args) {

		String[] array = { "geekf", "geeksforgeeks", "geesfor", "geeforty" };

		soluation1(array);

		solution2WordByWord(array);
	}

	public static void soluation1(String[] array) {

		String firstWord = array[0];

		char[] charArray = firstWord.toCharArray();

		char[] result = new char[charArray.length];

		boolean match = true;

		for (int i = 0; i < charArray.length; i++) {

			char c = charArray[i];

			for (int j = 1; j < array.length; j++) {

				char[] targetArray = array[j].toCharArray();

				if (i <= targetArray.length) {
					if (c != targetArray[i]) {
						match = false;
						break;
					}

				} else {
					match = false;
					break;
				}

			}

			if (!match) {
				break;
			} else {
				result[i] = c;
			}

		}

		System.out.println(result);
	}

	public static void solution2WordByWord(String[] array) {

		if (array == null) {
			System.out.println(array);
		}

		if (array.length == 1) {
			System.out.println(array[0]);
		}

		String commanPrefix = wordMatch(array[0], array[1]);

		for (int i = 2; i < array.length; i++) {

			commanPrefix = wordMatch(commanPrefix, array[i]);

		}
		System.out.println(commanPrefix);
	}

	private static String wordMatch(String firstWord, String secondWord) {

		int firstLength = firstWord.length();
		int secondLength = secondWord.length();
		int length = 0;
		String prefix = "";

		length = firstLength > secondLength ? secondLength : firstLength;
		for (int i = 0; i < length; i++) {
			if (firstWord.charAt(i) == secondWord.charAt(i)) {
				prefix = prefix + firstWord.charAt(i);
			}
		}

		return prefix;
	}

	public static void solutionUsingDivideAndConquer(String[] array) {

		if(array==null) {
			System.out.println(array);
		}
		
		int start = 0;
		int length = array.length;
		
		int mid = (start + length)/2;
	}
}
