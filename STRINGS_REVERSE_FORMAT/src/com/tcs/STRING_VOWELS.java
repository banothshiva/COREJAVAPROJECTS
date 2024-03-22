package com.tcs;

public class STRING_VOWELS 
{

	public static void main(String[] args) 
	{
		String name = "sathyatech";
		for (int i = 0; i < name.length(); i++) 
		{
			char ch = name.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				System.out.print(ch);
			}
			
		}

	}

}
