package com.sathya;

import java.util.Scanner;

public class SumOfArrayElements
{

	public static void main(String[] args)
	{
		// CREATE THE SCANNER OBJECT 
		Scanner scanner = new Scanner(System.in);
		//TAKING THE SIZE OF AN END USER 
		System.out.println("Enter The Size Of Array");
		int size = scanner.nextInt();
		//CREATE THE ARRAY WITH GIVEN SIZE 
		int[] numbers = new int[size];
		//TAKING THE ALL THE ELEMENTS FROM THE END USER 
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Enter......."+i+".......Index Value");
			numbers[i]=scanner.nextInt();
			//PRINT THE DATA 
			for (int number : numbers) {
				System.out.println(number);
			}
			//SUM OF THE ELEMENTS 
			int sum = 0;
			for (int j = 0; j < numbers.length; j++) {
				sum = sum +numbers[i];
			}
			System.out.println("SUM OF ALL ARRAY ELMENTS....."+sum);
			
		}
		//CLOSE THE SCANNER 
		scanner.close();

	}

}
