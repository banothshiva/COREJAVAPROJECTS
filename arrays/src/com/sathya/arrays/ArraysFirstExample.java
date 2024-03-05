package com.sathya.arrays;

public class ArraysFirstExample 
{

	public static void main(String[] args)
	{
		int[] marks = {80,52,99,55,22 };
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);
		System.out.println(marks[4]);
		System.out.println("*******************");
		
		// for loop used to print the marks
		for (int i = 0; i < marks.length; i++) 
		{
		System.out.println("YOUR MARKS...."+marks[i]);	
		}
		System.out.println("*********************");
		for (int mark : marks)
		{
			System.out.println("your marks for each ...."+mark);
		}
		for (int i = 1; i <=5; i++) 
		{
			for (int j = 0; j <= 5; j++)
			{
				System.out.println("i="+i+"j="+j);
			}
		}
	}

}
