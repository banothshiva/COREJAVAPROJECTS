package com.scanner.user.ex_1;

import java.util.Scanner;

public class ProductBillEx__02 
{

	public static void main(String[] args)
	{
		// create the scanner object
		Scanner sc = new Scanner(System.in);
		
		//read the data from command prompt
		System.out.println("Enter product name....");
		String productname=sc.next();
		System.out.println("Enter product price ....");
		double productprice=sc.nextDouble();
		System.out.println("Enter product quantity....");
        int productquantity=sc.nextInt();
        String pname;int pquantity=0;
		
        double totalAmount,disAmount,netAmount;
        totalAmount= productprice*pquantity;
        if (totalAmount>25000) 
        {
			disAmount=0.20/100;
		}
        else if (totalAmount<=20000&&totalAmount>15000) 
        {
		  disAmount=0.15/100;	
		}
        else if (totalAmount>10000&&totalAmount<=15000)
        {
			disAmount=0.10/100;
		} 
        else
        {
			disAmount=0.05/100;
			netAmount=totalAmount-disAmount;
			System.out.println("total bill.."+totalAmount+"\n"+"discount amount "+disAmount+"\n"+"net amount pay "+netAmount);
		}
			// close the scanner
        sc.close();
		}
	}

