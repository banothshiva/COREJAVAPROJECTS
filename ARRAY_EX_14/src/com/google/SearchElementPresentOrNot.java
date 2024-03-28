package com.google;

import java.util.Scanner;

public class SearchElementPresentOrNot 
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		//DECLARATION
		int[] numbers = {10,20,30,44,55};
		System.out.println("ENTER YOUR  NUMBER TO CHEACK WETHER NUMBER IS PRESNT OR NOT ");
		int indexValue = scanner.nextInt();
		//TACKING THE ALL THE ELEMENTS FROM THE END USER SORTING INTO ARRAY
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i]==indexValue) 
			{
				System.out.println("ELEMENT IS PRESENT........ "+indexValue);
				break;
			}
			else {
				System.out.println("ELEMENT IS NOT PRESENT......"+indexValue);
			}
		}
		scanner.close();
	}

}
