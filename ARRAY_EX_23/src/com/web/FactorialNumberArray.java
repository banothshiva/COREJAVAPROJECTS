package com.web;
public class FactorialNumberArray {

	public static void main(String[] args) {
		int[] numbers = {2,3,4,5,6,7,8,9,};
		for (int i = 0; i < numbers.length; i++) {
			int fact = 1;
			for (int j = 1; j < numbers[i]; j++) {
				fact*=j;
			}
			System.out.println("Factorial of a... "+numbers[i]+"with index....."+fact);
		}
		
	}

}
