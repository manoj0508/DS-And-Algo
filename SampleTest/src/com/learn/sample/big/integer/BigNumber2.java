package com.learn.sample.big.integer;

import java.util.Scanner;

public class BigNumber2 {

	public static void main(String[] args) {

		// Input
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n + 2];
		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
		}
		sc.close();

		// Write your code here
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s.length; j++) {
				if (s[i] != null && s[j] != null) {
					int compare = s[i].compareTo(s[j]);

					if (compare > 0) {
						String t = s[i];
						s[i] = s[j];
						s[j] = t;
					}
				}
			}
		}

		// Output
		for (int i = 0; i < n; i++) {
			System.out.println(s[i]);
		}

	}

}
