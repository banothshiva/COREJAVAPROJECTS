package com.web;

import java.util.Scanner;

public class ScannerFirstAndLastIndexNumbers
{

	public static void main(String[] args) 
	{
		Scanner scanner = new  Scanner(System.in);
		// DECLARATION
		int[] numbers = {10,20,15,5,3};
		System.out.println("Enter Your First Index Value ");
		int first = scanner.nextInt();
		System.out.println("Enter Your Second Index Value ");
		int second  = scanner.nextInt();
			if ((first>0 && first< numbers.length)&&(second>0 && second<numbers.length))
			{
				int temp = numbers[first];
				numbers[first]= numbers[second];
				numbers[second]=temp;
				
			}
			for (int number : numbers) {
				System.out.println(number);
			}
		// SCANNER CLOSING 
		scanner.close();

	}

}
