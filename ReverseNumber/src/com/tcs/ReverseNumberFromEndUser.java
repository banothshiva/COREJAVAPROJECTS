package com.tcs;

import java.util.Scanner;

public class ReverseNumberFromEndUser 
{

	public static void main(String[] args)
	{
		// creating a scanner class 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int numbers = sc.nextInt();
		int number = 0;     //6789
		int reverseNumber = 0;
		while(number != 0) 
		{
			int digit = number % 10;
			reverseNumber = reverseNumber * 10 + digit;
			number = number / 10;
		}
		
		System.out.println("reversed number "+reverseNumber);
		sc.close();
	     // close the connection
		
	}
	
}

