package com.sathya;

public class SumOfMaxAndMinNumbers {

	public static void main(String[] args) {
		// DECLARATION 
		int[] numbers = {15,33,44,11,66,89,};
		int max = numbers[0];   // MAX AS INITIAL VALUE IS 0
		int min = numbers[0];	 // MIN AS INITIAL VALUE IS 0
		int total =0;   
		for (int i = 0; i < numbers.length; i++)
		{
			if (numbers[i]>max) 
			{
			   max = numbers[i];	
			}
			if (numbers[i]<min)
			{
				min = numbers[i];
			}
			
		}
		total = max + min;
		System.out.println("SUM OF THE MAX AND MIN NUMBERS IS "+total);
		
		
	}

}
