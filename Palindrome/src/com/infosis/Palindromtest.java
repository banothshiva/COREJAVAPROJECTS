package com.infosis;
import java.util.Scanner;

public class Palindromtest
{

	public static void main(String[] args)
	{
		// creating a new scanner class object
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Palindrom Number......."); //1234121
		int num = sc.nextInt();
		int  number =0;
		int reverse = 0;
		while (number != 0 )
		{
			
			int digit = number % 10;
			reverse = reverse*10+digit;
			number = number/10;
		}
		if(number == reverse) {
			System.out.println("THE GIVEN NUMBER IS PALINDROME NUMBER ........"+ number);
		}
		else
		{
			System.out.println("THE GIVEN NUMBER NOT A PALINDROME NUMBER"+number);
		}
		
		// close the connection
		sc.close();
	}

}
