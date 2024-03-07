package com.sathya.cjava.loops.ex;

import java.util.Iterator;

public class EvenSumAndOddSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          // initially taken sum is 0
	 int evenSum=0 ,oddSum=0;
	for (int i = 1; i <=10; i++)
	{
		if (i%2==0)
		{
			evenSum+=i;
		}
		else {
			oddSum+=i;
		}
		
	}
	System.out.println("EVEN SUM FOR 1 TO 10 EVEN NUMBERS....."+evenSum);
	
	System.out.println("ODD SUM FOR 1 TO 10 ODD NUMBERS....."+oddSum);
	
	
	}

}
