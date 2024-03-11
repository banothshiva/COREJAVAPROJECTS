package com.scanner.user.ex_1;

import java.util.Scanner;

public class EvenOrOddPositiveOrNegative
{

	public static void main(String[] args)
	{
		/// create the scanner object
		Scanner a = new Scanner(System.in);
        ///read the data from command prompt
	   System.out.println("Enter the number");
	   int num = a.nextInt();
	   /// logic part here
	   if (num>0)
	   {
		if (num%2==0)
		{
			System.out.println("Given number is +Ve and Even");
		}
		else
		{
			System.out.println("Give Number is +Ve and Odd");
		}
		
	   }
	   else
	  {
		if (num%2==0)
	    {
			System.out.println("Given Number is -Ve add Even");
		}
		else 
		{
			System.out.println("Given number is -Ve and Odd");
		}
	   }
	   ///close the scanner
	   a.close();
	
	}
}
