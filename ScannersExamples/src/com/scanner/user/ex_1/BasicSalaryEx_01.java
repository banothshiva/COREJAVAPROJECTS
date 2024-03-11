package com.scanner.user.ex_1;

import java.util.Scanner;

public class BasicSalaryEx_01
{

	public static void main(String[] args) 
	{
		// create scanner object
		Scanner sc = new Scanner(System.in);
		//read the data from command prompt
		System.out.println("Enter basic salary");
	    double basicSalary = sc.nextDouble();
	    double hra,pf,da;
	    
	    // logic part here presenting
	    if (basicSalary>50000) 
	    {
			hra=0.3;
			da=0.1;
			pf=0.06;
		}
	   else if (basicSalary>25000&&basicSalary<=50000)
	   {
		hra=0.2;
		da=0.5;
		pf=0.03;
	   }
	  else 
	  {
		hra=0.1;
		da=0.03;
		pf=0.02;
	  }
	   /// caluclating the salary of persons
	    hra=hra*basicSalary;
	    da=da*basicSalary;
	    pf=pf*basicSalary;
	    /// creating new local variable for calling the gross salary
	    double grossSalary=0.0;
	    //implementing the calculate the salary 
	     grossSalary=basicSalary+hra+da-pf;
	     
	     // printing the salary of employees
	       System.out.println("Your Basic Salary"+basicSalary+"\n"+"HRA Salary"+hra+"\n"+"DA Salary"+da+"\n"+"your PF amount "+"\n"+pf);
	}

}
