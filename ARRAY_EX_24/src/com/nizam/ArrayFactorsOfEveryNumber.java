package com.nizam;

public class ArrayFactorsOfEveryNumber {

	public static void main(String[] args) {
		int[] numbers = {12,13,14,44};
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Factors of......."+numbers[i]);
			for (int j = 1; j < numbers[i]; j++) {
				if (numbers[i]%j==0)
				{
					System.out.println(j+"");
				}
			}
		
		}
	}

}
