package com.web;

public class ArrayPrimeNumber {

	public static void main(String[] args) {
		int[] numbers = {12,3,7,15,19,87,89,26};
		for (int i = 0; i < numbers.length; i++) {
			int fact =0;
			int index = 0;
			for (int j = 2; j < numbers[i]; j++) {
				if (numbers[i]%2==0) {
					fact++;
				}
				index=i;
			}
			if (fact==0) 
			{
				System.out.println("PRIME NUMBER........ "+numbers[i]+"..."+"WITH INDEX........"+index);
				
			}
		}
		
	}

}
