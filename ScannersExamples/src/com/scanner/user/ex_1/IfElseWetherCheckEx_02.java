package com.scanner.user.ex_1;

import java.util.Scanner;

public class IfElseWetherCheckEx_02 
{

	public static void main(String[] args)
	{
		//creating a scanner class
		Scanner sc = new Scanner(System.in);
		//input  taken from the end user
		System.out.println("it is raining true/false");
	    boolean israining = sc.nextBoolean();
	    System.out.println("it is winding true/false");
		boolean iswinding = sc.nextBoolean();
		//here logic part 
		if (israining&&iswinding)
		{
			System.out.println("cyclone effected do not go outside!..");
		}
		else if (iswinding||israining)
		{
		System.out.println("wether is not static do not go outside!.....");	
		}
		else {
			System.out.println("wether is cool!go outside.....");
		}
		// lose the scanner
		sc.close();
		
		}

}
