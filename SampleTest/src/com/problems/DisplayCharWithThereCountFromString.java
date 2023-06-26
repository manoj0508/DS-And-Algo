package com.problems;

/**
 * sample inpiut => aaaabbccccdda out => a4b2c4d2a1
 * 
 * @author manojkumar
 *
 */
public class DisplayCharWithThereCountFromString {

	public static void main(String[] args) {

		String str = "aaaabbccccddaa";

		char[] charArray = str.toCharArray();

		int count = 1;

		for (int i = 0; i < charArray.length - 1; i++) {

			if (charArray[i] == charArray[i + 1]) {
				count++;
			} else {
				System.out.print(charArray[i] + "" + count);
				count = 1;
			}

			if (i == charArray.length - 2) {

				if (charArray[i] != charArray[i + 1]) {
					System.out.println(charArray[i + 1] + "" + count);
				} else {
					System.out.println(charArray[i] + "" + count);
				}

			}
		}

	}

}
