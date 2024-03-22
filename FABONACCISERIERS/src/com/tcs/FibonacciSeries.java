package com.tcs;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("ENTER YOUR FIBONACCI NUMBER");
		int number = scanner.nextInt();

		int num1 = 0, num2 = 1, sum;

		System.out.print(num1 + " " + num2 + " ");

		for (int i = 3; i <= number; i++) {
			sum = num1 + num2;
			System.out.print(sum + " ");
			num1 = num2;
			num2 = sum;
		}

		scanner.close();
	}

}
