package com.scanner.user.ex_1;

import java.util.Scanner;

public class ProductDetailsIfElse__02
{

	public static void main(String[] args)
	{
		// create the scanner object
		Scanner sc =new Scanner(System.in);
		
		// read data from the command prompt
		System.out.println("enter product name...");
		String productname = sc.next();
		System.out.println("enter product price...");
        Double productprice = sc.nextDouble();
        System.out.println("enter product quantity...");
        int productquantity = sc.nextInt();
        Double totalprice,discountamount=null,netamount=null;
        totalprice = productprice*productquantity;
        
        ///logic part here 
        if (totalprice > 1000) 
       {
		discountamount = totalprice*20/100;
		netamount = totalprice -discountamount;
		System.out.println("Product name......"+productname);
		System.out.println("Product price ....."+productprice);
        System.out.println("Total price........"+totalprice);
	    System.out.println("Discount Amount.........."+discountamount);
    	System.out.println("NET amount to pay........."+netamount);
	   }
       else 
       {
    	discountamount = totalprice*10/100;
		netamount = totalprice -discountamount;
		System.out.println("Product name......"+productname);
		System.out.println("Product price ....."+productprice);
        System.out.println("Total price........"+totalprice);
	    System.out.println("Discount Amount.........."+discountamount);
    	System.out.println("NET amount to pay........."+netamount);
	  }
        //close the scanner 
        sc.close();
  }

}





