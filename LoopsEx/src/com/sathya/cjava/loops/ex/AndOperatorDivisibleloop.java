package com.sathya.cjava.loops.ex;

public class AndOperatorDivisibleloop
{

	public static void main(String[] args) 
	{
	  // divisiable by 3 - 5 or not
		for (int i = 10; i <=20; i++)
		{
			if (i%3==0&&i%5==0)
				continue;
			{
				System.out.println(i);
			}
		}
	
	
	
	}

}
