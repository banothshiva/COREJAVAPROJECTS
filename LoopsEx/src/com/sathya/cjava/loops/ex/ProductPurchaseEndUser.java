package com.sathya.cjava.loops.ex;

public class ProductPurchaseEndUser
{

	public static void main(String[] args)
	{
		 double product=1200;
		 double selling=800;
		 double result;
		 
		 result = product-selling;
		  if (result > 0)
		  {
			System.out.println("You Got Profit..."+result);
		  }
		  else if (result < 0)
		  {
			System.out.println(" You Got Loss......"+result);
		  }
		  else 
		  {
			System.out.println(" You GOt loss/profit");
		  }

	}

}
