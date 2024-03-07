package com.sathya.cjava.loops.ex;

import java.util.Iterator;

public class ForLoopSecondEx_2
{

	public static void main(String[] args)
	{
		// printing the even numbers
		for (int i = 1; i <=10; i++)
		{
			if (i%2==0) 
			{
				System.out.println("Given number is Even......"+i);
			}
		}
		System.out.println("*************************************");
		// print the odd numbers
		for (int i = 10; i <=20; i++)
		{
			if(i%2!=0)
			{
				System.out.println("Givennumber Is Odd...."+i);
			}
		}
		System.out.println("*********************************************");
		// here both logics 
		for (int i = 5; i <=15; i++)
		{
			if (i%2==0)
			{
				System.out.println("EvEN..."+i);
			}
			else
			{
				System.out.println("ODD..."+i);
			}
		}
		System.out.println("*********************************");
	}

}
