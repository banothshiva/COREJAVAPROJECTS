package com.sathya.cjava.loops.ex;

public class CharVowelsAndConsonentsEx 
{

	public static void main(String[] args)
	{   // printing the vowels 
			for (char ch = 'a'; ch <='z'; ch++)
			{
		    	if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') 
				{
					System.out.println(" Given Character Is Vowel..."+ch);
				}
			}
	     System.out.println("*********************************************");
	   // printing  the consonents 
	     for (char c = 'A'; c <='Z'; c++)
			{
		    	if (c!='a'&& c!='e'&& c!='i'&& c!='o'&& c!='u') 
				{
					System.out.println(" Given Character Is Vowel..."+c);
				}
        	}
	}

}
