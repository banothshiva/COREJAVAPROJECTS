package com.infosis;

public class String_3_Elements_Index_Of_Null_Values 
{

	public static void main(String[] args) 
	{
		String[] names = new String[5];  //DECLARATION
		names[0]="shyam";				// INTIALIZATION
		names[1]="shiva";
		names[2]="mahesh";
		for (int i = 0; i < names.length; i++)
		{
			if (names[i]==null) 
			{
				System.out.println(i);

			}
		}

	}

}
// out put 
// 3
// 4 