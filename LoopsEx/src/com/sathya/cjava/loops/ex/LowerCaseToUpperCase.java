package com.sathya.cjava.loops.ex;

public class LowerCaseToUpperCase 
{

	public static void main(String[] args) 
	{
		// Enter Here Letter what you want
       char ch='A';
       //render in Lower Case 
        if(ch>='a'&&ch<='z')
        {
	      System.out.println("Lower Case.........");
        }
        // render to upper case
        else if (ch>='A'&&ch<='Z')
        {
			System.out.println("Upper Case........");
		}
        // render to digits
        else if (ch>='1'&&ch<='9')
        {
			System.out.println(" Is Digit........... ");
		}
        // render to special characters
        else {
        	System.out.println("Special Character............");
        }
	}

}
