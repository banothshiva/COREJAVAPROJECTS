package com.sathya;
import java.util.*;
import java.util.Scanner;

public class BiggerNumCheck_1 {

	public static void main(String[] args)
	{
		// create the scanner class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number");
		long number =sc.nextLong();
		long n = number;
		long largestdigit = 0;
		while(number > 0)
		{
			long digit = number % 10;
			if (digit > largestdigit) 
			{
				largestdigit = digit;
				
			}
			number = number / 10;
		}
		System.out.println("largest number "+number);
		// close the connection 
		sc.close();
	}

}
