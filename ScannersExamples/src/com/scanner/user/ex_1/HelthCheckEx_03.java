package com.scanner.user.ex_1;

import java.util.Scanner;

public class HelthCheckEx_03
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		// scanner class creation
		Scanner sc = new Scanner(System.in);
		// taking input from patient
		System.out.println("enter are you suffering from fever:");
		boolean fever = sc.nextBoolean();
		System.out.println("are you suffering with cold :");
		boolean cold = sc.nextBoolean();
		//logic part here 
		if ((fever==true)||cold==true)   
        {
			System.out.println("you are not feeling well...go to hospital");
		}
		else {
			System.out.println("you are okk attend the class");
		}
		// closing the scanner
		sc.close();

	}

}
