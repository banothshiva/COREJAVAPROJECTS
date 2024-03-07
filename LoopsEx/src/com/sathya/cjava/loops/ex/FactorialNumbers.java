package com.sathya.cjava.loops.ex;

import java.util.Scanner;

public class FactorialNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//cerating the new scanner class
		Scanner sc = new Scanner(System.in);
		//giving data to the input 
		System.out.println("Enter the Factorial number to find factorial");
		int number = sc.nextInt();
		int fact = 1;
		
		for (int i = 1; i <= number; i++)
		{
			fact = fact*i;
			
		}
		
		System.out.println("factorial of a number .."+number+"="+fact);
		// close the connection
		sc.close();

	}
	

}
