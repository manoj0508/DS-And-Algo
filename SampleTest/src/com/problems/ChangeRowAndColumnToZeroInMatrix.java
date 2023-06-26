package com.problems;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ChangeRowAndColumnToZeroInMatrix {

	public static void main(String[] args) {

		int[][] array = { { 1, 0, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };

		//solution1(array);
		
		System.out.println();
		
		solution2(array);
	}

	public static void solution1(int[][] array) {
		int count = 0;
		Map<Integer, List<Integer>> map = new HashMap<>();

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				if (array[i][j] == 0) {
					count++;

					map.put(count, Arrays.asList(i, j));

				}
			}
		}

		Collection<List<Integer>> values = map.values();

		for (List<Integer> value : values) {

			int k = value.get(0);
			int l = value.get(1);

			for (int i = 0; i < 3; i++) {
				array[i][l] = 0;
			}

			for (int j = 0; j < 3; j++) {
				array[k][j] = 0;
			}
		}

		printArray(array, 3, 3);

	}

	public static void solution2(int[][] array) {

		Set<Integer> rows = new HashSet<>();
		Set<Integer> columns = new HashSet<>();

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				if (array[i][j] == 0) {
					rows.add(i);
					columns.add(j);
				}
			}
		}

		for (Integer row : rows) {
			for (int j = 0; j < 3; j++) {
				array[row][j] = 0;
			}
		}
		
		for (Integer column : columns) {
			for (int j = 0; j < 3; j++) {
				array[j][column] = 0;
			}
		}
		
		printArray(array, 3, 3);

	}

	private static void printArray(int[][] array, int m, int n) {

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(array[i][j] + " ");
			}

			System.out.println();
		}
	}

}
