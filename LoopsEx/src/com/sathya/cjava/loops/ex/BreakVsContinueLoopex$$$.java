package com.sathya.cjava.loops.ex;

public class BreakVsContinueLoopex$$$ 
{

	public static void main(String[] args)
	{
		// using the break statement
		for (int i = 1; i <=10; i++) 
	    {
	    	if (i%4==0)
		    {
		    	break;
		    }
		      System.out.println("skip the iteration the ........."+i);
    	}
	System.out.println("****************************************");
		// using the continue statement
		for (int i = 1; i <= 20; i++)
		{
			if (i%7==0)
			{
				continue;
			}
			System.out.println(" continu the iteration stll the end ....."+i);
		}
	}

}
