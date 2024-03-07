package com.sathya.cjava.loops.ex;

public class CharactersLoopEx_3 
{

	public static void main(String[] args)
	{
           // print the characters a to z
		for (char  ch = 'a'; ch <='z'; ch++)
		{
			System.out.println(ch+" ");
		}
		
		System.out.println("****************");
		// print the characters A - Z
		for (char c = 'A'; c <= 'Z'; c++)
		{
			System.out.println(c+" ");
		}
		
		System.out.println("***************************");
	   // printing the vowels 
		for (char v = 'a'; v <='z'; v++)
		{
			if (v=='a'||v=='e'||v=='i'||v=='o'||v=='u') 
			{
				System.out.println(" Given Character Is Vowel..."+v);
			}
		}
	
	
	
	}
         
}
