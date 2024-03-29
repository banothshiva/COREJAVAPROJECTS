package com.tcs;

import java.util.Random;

public class GetRandomArray 
{
	public static int[] getRandomArray(int size )
	{
		int[] numbers = new int[size];
		Random ramdom = new Random();
		for (int i = 0; i < numbers.length; i++) {
			numbers[i]=ramdom.nextInt(100);
			
		}
		return numbers;
		
	}
	public static void main(String[] args) 
	{
		int[] result = GetRandomArray.getRandomArray(5);
		for (int res : result)
		{
			System.out.println(res);
		}
	}

}
