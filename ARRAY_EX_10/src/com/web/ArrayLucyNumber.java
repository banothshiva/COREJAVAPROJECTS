package com.web;

public class ArrayLucyNumber {
	
	public static void main(String[] args) {
		
		int[] numbers = {26,65,77,9,11};
		for (int i = 0; i < numbers.length; i++) {
			int num = numbers[i];
			int sum = 0;
			while (num!= 0) {
				int digit = num % 10;
				sum = sum+digit;
				num = num / 10;
				
			}
			System.out.println("LUCY NUMBER OF...."+numbers[i]+"="+sum);
		}
	}

}
