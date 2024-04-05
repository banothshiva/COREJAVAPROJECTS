package com.web;

public class SumOfAllNumbersMinAndMax {

	public static void main(String[] args) {
		// Define the array
		int[][] numbers = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};

		// Calculate the sum of all elements in the array
		int sum = 0;
		for (int[] row : numbers) {
			for (int num : row) {
				sum += num;
			}
		}
		System.out.println("SUM OF ARRAY ELEMENTS: " + sum);

		// Calculate the sum of each row
		for (int i = 0; i < numbers.length; i++) {
			int rowSum = 0;
			for (int j = 0; j < numbers[i].length; j++) {
				rowSum += numbers[i][j];
			}
			System.out.println("SUM OF ROW " + i + ": " + rowSum);
		}

		// Calculate the sum of each column
		for (int i = 0; i < numbers.length; i++) {
			int colSum = 0;
			for (int j = 0; j < numbers.length; j++) {
				colSum += numbers[j][i];
			}
			System.out.println("SUM OF COLUMN " + i + ": " + colSum);
		}
	}
}
