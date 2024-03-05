package com.tcs;

public class Client
{

	public static void main(String[] args)throws Exception 
	{
		int  price = 100;
		if (price < 0)
		{
			throw new MyOwnException(price);
			
		}
		else {
			System.out.println("YOUR PRICE IS : "+price);
		}
	}

}
