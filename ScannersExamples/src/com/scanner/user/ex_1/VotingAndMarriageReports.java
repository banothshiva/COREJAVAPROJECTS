package com.scanner.user.ex_1;

import java.util.Scanner;

public class VotingAndMarriageReports 
{

	public static void main(String[] args)
	{
		//create the scanner
		Scanner sc = new Scanner(System.in);
		//read the data from the command prompt
		System.out.println("Enter person name ");
		String name=sc.next();
		System.out.println("Enter the person age");
		int age = sc.nextInt();
		System.out.println("Entter the person gender");
		String gender= sc.next();
		if (gender.equalsIgnoreCase("female"))        // "gender contains female"
		   {
			if (age>18)
			{
				System.out.println("Hay hai*****:"+name+"***your age is ****"+age+"**eligible for vote****"+"**you are *****"+gender);
			}
			else 
			{
				System.out.println("Hay hai*****"+name+"**your age is ****"+age+"**not eligible for vote****"+"**you are *****"+gender);
			}
		   }
		    if (age>21) 
		   {
			System.out.println("Hay hai*****"+name+"**your age is ****"+age+" **eligible for Marry****"+"**you are *****"+gender);
		   }
		   else
		   {
			System.out.println("Hay hai*****"+name+"**your age is ****"+age+"**not eligible for Marry****"+"**you are *****"+gender);
		   }
	}	
}


