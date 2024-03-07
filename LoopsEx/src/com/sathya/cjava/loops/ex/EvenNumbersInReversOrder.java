package com.sathya.cjava.loops.ex;

public class EvenNumbersInReversOrder {

	public static void main(String  args[]) {
		// TODO Auto-generated method stub
		// An array of numbers
		int[] num1= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		// Loop from the last element to the first element
		for (int  i = num1.length - 1; i >= 0; i--) {
		  // Check if the current element is even
		  if (num1 [i] % 2 ==0)
		  {
		    // Print the even number
		   System.out.println("REVERSE EVEN NUMBERS...."+num1[i]);
		  }
		}

	}

}
