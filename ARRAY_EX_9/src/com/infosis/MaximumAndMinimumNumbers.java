package com.infosis;

public class MaximumAndMinimumNumbers 
{

	public static void main(String[] args)
	{
		int[] numbers = {20,30,10,40,60}; //DECLARATION , INSTATITION & INITIALISATION 
		
		// MAXIMUM NUMBER printing 
		int max = numbers[0];
		for (int i = 0; i < numbers.length; i++) 
		{
			if (numbers[i]>max)
			{
				max = numbers[i];
			}
		}
		System.out.println("MAXIMUM NUMBER ........"+max);
		
		// MINIMUM  NUMBER
		int min = numbers[0];
		for (int i = 0; i < numbers.length; i++) 
		{
			if (numbers[i]<min)
			{
				min = numbers[i];
				
			}
			
		}
		System.out.println("MINIMUM NUMBER ........"+min);
	}

}
