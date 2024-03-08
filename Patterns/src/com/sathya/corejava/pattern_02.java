package com.sathya.corejava;

public class pattern_02 {

	public static void main(String[] args)
	{
		for (int row = 5; row <=1; row++)
		{
		for (int col = 5; col <= row; col--) 
		{
			System.out.println("* ");
		}
		System.out.println();
		}
	}

}
