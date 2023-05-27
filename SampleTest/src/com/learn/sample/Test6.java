package com.learn.sample;

public class Test6 {

	static int m = 3, n = 4;

	public static void main(String[] args) {
		int[][] array = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
		matrixArry(array);
		printArray(array);
	}

	public static void matrixArry(int[][] array) {

		int target = 61;

		boolean found = false;

		for (int i = 0; i < m; i++) {
			int a = array[i][0];
			if (a == target) {
				found = true;
				break;
			} else if (target < a) {
				if (i == 0) {
					break;
				}
				for (int k = 0; k < n; k++) {
					if (target == array[i - 1][k]) {
						found = true;
						break;
					}
				}

				break;

			} else if (i == m-1) {
				if (target == array[m-1][n-1]) {
					found = true;
					break;
				} else if (target < array[m-1][n-1]) {
					for (int k = 0; k < n; k++) {
						if (target == array[i][k]) {
							found = true;
							break;
						}
					}
				}
			}

		}

		if (found) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

	public static void printArray(int[][] array) {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}
