package com.web;

public class SumOfMarks {

	public static void main(String[] args) {

		int[] marks = {10,29,50,40,55};
		int sum =0;
		for (int i = 0; i < marks.length; i++) 
		{
			sum=sum+marks[i];
		//	System.out.println("sum OF THE MARKS ELEMENTS......."+sum);

		}
		System.out.println("sum OF THE MARKS ELEMENTS......."+sum);

		int prod =1;
		for (int i = 0; i < marks.length; i++) 
		{
			prod = prod*marks[i];
			
		}
		
		System.out.println("PRODUCT  OF THE ALL  ELEMENTS......."+prod);

	}

}
