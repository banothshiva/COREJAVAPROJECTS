package com.scanner.user.ex_1;

import java.util.Scanner;

public class DivisiableBy3And7OrNotScanner
{

	public static void main(String[] args) 
	{
		// Creating the scanner class
		Scanner s = new Scanner(System.in);
		//taking the input
		System.out.println("Enter a number ");
	    int number= s.nextInt();
	    //here is logic presents
	    if ((number%3==0)&& number%7==0)
	    {
		  System.out.println("given number is Divisiable by 3 and 7");
		}
		else 
		{
		  System.out.println("not divisiable by 3 and 7");
		}
	    // close the scanner
	    s.close();
	}
	    
}

