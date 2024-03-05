package com.tcs;

public class FirstCharNumberOrNot
{

	public static void main(String[] args)
	{
		// Check the Character/First Character Of a String is Number or Not in Java

		String str = "2AVA4S";
		
		
        //Check whether the given character is a number of not ?

		for (int i = 0; i < str.length(); i++)
		{
			Boolean flag = Character.isDigit(str.charAt(i));
			if (flag) {
				System.out.println(""+str.charAt(i)+"...is an number");
			}
			else {
				System.out.println(""+str.charAt(i)+"....not an number");
			}
	          //To check first character is a number or not ?
			Boolean flag1 = str.substring(0,1).matches("[0-9]");
			if (flag1)
			{
				System.out.println("First Character is a number..!");
				
			}
			else {
				System.out.println("First Character is not a number..!");
			}
		}

	}

}

