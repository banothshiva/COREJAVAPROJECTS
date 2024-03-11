package com.scanner.user.ex_1;

import java.util.Scanner;

public class ElseIfpositiveNumber 
{

	public static void main(String[] args) 
	{
		// scanner class creation
		Scanner sc = new Scanner(System.in);
		//input initializing
		System.out.println("Enter a number");
		int number = sc.nextInt();
		//taking conditional statement
		if(number>0) {
			System.out.println("given number is positive....."+number);
		}
		else if (number<0) {
			System.out.println("given number is negetive...."+number);
		}
		else {
			System.out.println("given number is zero...."+number);
		}
		//closing the scanner
		sc.close();
		}
	}


