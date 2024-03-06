package com.biggestNumbersEx1;

import java.util.Scanner;

public class BiggerNumberCheckIfElse_1 {

	public static void main(String[] args) {
		//create the scanner class
		Scanner sc = new Scanner(System.in);
		//intialize the data
		System.out.println("Enter the first number");
        int num1	=sc.nextInt();
        System.out.println("Enter the second number");
        int num2=sc.nextInt();
        if (num1>num2) {
			System.out.println("number 1 is bigger...."+num1);
		}
        else if (num2>num1) {
			System.out.println("number 2 is bigger...."+num2);
		}
        else {
			System.out.println("both are same");
		}
        //close the scanner
        sc.close();
	}

}
