package com.tcs;

public class Remove_Unwanted_characters 
{

	public static void main(String[] args) 
	{
		String s = "(123)-456 7891  ABCDE-@#$-FGHIJK aabbcc)";
		s=s.replaceAll("[^a-zA-Z0-9 ]", "");
		System.out.println(s);
		

	}

}
