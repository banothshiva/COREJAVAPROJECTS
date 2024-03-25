package com.tcs;

public class EvenIndexAndOddIndexNamesWithValues {

	public static void main(String[] args) {

		String[] stateNames = {"Telangana","Andra","goa","Panjab","Chennai","karnataka","Kerala"};
		for (int i = 0; i < stateNames.length; i++) 
		{
			// PRINTING THE NAMES WITH INDEX VALUES 
			System.out.println(stateNames[i]+"----INDEX----"+i);
		}
		System.out.println("-------------------");
		//PRINTING THE EVEN INDEX NAMES WITH NAME  INDEX VALUES 
		for (int i = 0; i < stateNames.length; i++)
		{
			if (i % 2==0)
			{
				System.out.println(stateNames[i]+".......EVEN INDEX ...."+i);
			}
			
		}
		System.out.println("-------------------");

		for (int i = 0; i < stateNames.length; i++) 
		{
			if (i%2!=0)
			{
				System.out.println(stateNames[i]+".....ODD INDEX ....."+i);
			}
			
		}
	}

}
