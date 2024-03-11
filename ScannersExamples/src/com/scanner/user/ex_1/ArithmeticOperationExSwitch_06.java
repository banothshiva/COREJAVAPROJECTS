package com.scanner.user.ex_1;

import java.util.Scanner;

public class ArithmeticOperationExSwitch_06 
{

	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number...");
	    int num1=sc.nextInt();
        System.out.println("Enter second number......");
        int num2=sc.nextInt();
        System.out.println("Enter the operator +-*/%");
        char result = sc.next().charAt(0);
        
        switch (result) {
		case '+':System.out.println("add of two numbers..."+(num1+num2));
		break;
		case '-':System.out.println("sub of two numbers..."+(num1-num2));
		break;
		case '*':System.out.println("mul of two numbers..."+(num1*num2));
		break;
		case '/':System.out.println("div of two numbers..."+(num1/num2));
		break;
		case '%':System.out.println("modules of two numbers..."+(num1%num2));
		break;
		default:System.out.println("enter some valid data");
			break;
		}     
	}

}
