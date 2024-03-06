package com.biggestNumbersEx1;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class EmployeeEx_1 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//Scanner object creation
		Scanner  s = new Scanner(System.in);
		//read the data from command prompt
		System.out.println("enter empid...");   //123
		int empid=s.nextInt();
         System.out.println("enter emp name...");  
        String name =s.next();
        System.out.println("enter emp salary...");
       double empSalary =s.nextDouble();
        if (empSalary<5000)
        { System.out.println("he is a poor employee");
        System.out.println("empid..."+empid);
        System.out.println("empname..."+name);
        System.out.println("empSalary..."+empSalary);
        }
        else  {
		System.out.println("he is a rich employee");
        System.out.println("empid..."+empid);
        System.out.println("empname..."+name);
        System.out.println("empSalary..."+empSalary);
        }
        //close the Scanner object
        s.close();
	}

}
