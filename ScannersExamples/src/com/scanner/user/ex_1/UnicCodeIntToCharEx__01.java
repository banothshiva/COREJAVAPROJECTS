package com.scanner.user.ex_1;

import java.util.Scanner;

public class UnicCodeIntToCharEx__01
{

	public static void main(String[] args) 
	{
		// create scanner object
		Scanner sc = new Scanner(System.in);
		// read the data from command prompt
		System.out.println("Enter your unic code number...");
         int num = sc.nextInt();
         switch (num) 
         {
		   case 'A':System.out.println("The Corresponding char is A.....");
		   break;
		   case 'B':System.out.println("The Corresponding char is B.....");
		   break;
		   case 'C':System.out.println("The Corresponding char is C.....");
		   break;
		   case 'D':System.out.println("The Corresponding char is D.....");
		   break;
           default:System.out.println("Enter some valid data .....");
		   break;
		}
         // close the scnner
         sc.close();
	}

}
