package com.learn.string.problems;

import java.util.Stack;

public class ReversWords {

	public static void main(String[] args) {

		String s = "geeks quiz practice code";

		solution1(s);

		solutionUsingStack(s);
		
		solutionUsingReverseWord(s);

	}

	public static void solution1(String str) {

		String[] split = str.split(" ");

		StringBuilder stBuilder = new StringBuilder();

		for (int i = split.length - 1; i >= 0; i--) {
			stBuilder.append(split[i] + " ");
		}

		System.out.println(stBuilder);

	}

	public static void solutionUsingStack(String str) {

		Stack<Character> stack = new Stack<>();
		StringBuilder stBuilder = new StringBuilder();

		char[] charArray = str.toCharArray();

		for (int i = charArray.length - 1; i >= 0; i--) {

			if (charArray[i] == ' ') {

				while (!stack.isEmpty()) {
					stBuilder.append(stack.pop());
				}
				stBuilder.append(" ");

			} else {

				stack.push(charArray[i]);

				if (i == 0) {
					while (!stack.isEmpty()) {
						stBuilder.append(stack.pop());
					}
					stBuilder.append(" ");
				}
			}

		}

		System.out.println(stBuilder);
	}

	public static void solutionUsingReverseWord(String str) {

		char[] charArray = str.toCharArray();
		
		int start=0;
		for(int i=0; i<charArray.length; i++) {
			if(charArray[i]== ' ') {
				reverse(charArray, start, i);
				start = i+1;
			}
		}
		
		reverse(charArray, start, charArray.length-1);
		
		reverse(charArray, 0, charArray.length-1);
		
		System.out.println(charArray);
	}

	public static void reverse(char str[], int start, int end) {

		while (start <= end) {

			char temp = str[end];
			str[end] = str[start];
			str[start] = temp;
			start++;
			end--;
		}
	}

}
