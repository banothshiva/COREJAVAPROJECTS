package com.scanner.user.ex_1;

import java.util.Scanner;

public class StudentMarksListEx__02
{

	public static void main(String[] args)
	{
		// create the scanner object
		Scanner sc =  new Scanner(System.in);
		// read the data from commmand prompt
		System.out.println("Enter the maths marks......");
		int mathmarks = sc.nextInt();
		System.out.println("Enter the social marks.......");
        int socialmarks = sc.nextInt();
        System.out.println("Enter the science marks .....");
	    int sciencemarks = sc.nextInt();
	    int total=0;
        total=socialmarks+sciencemarks+mathmarks;
        
        double avg=0.0;
        avg = total/3;
        char grade=' ';              //space
	    switch (grade)
	   {
		case 'A':grade='A';
		break;
		case 'B':grade='B';
		break;
		case 'C':grade='C';
		break;
		case 'D':grade='D';
		break;
		case 'F':grade='F';
		break;
	   }
	    if (avg>70) 
	    {
			grade='A';
		}
	else if (avg>=60&&avg<=70)
	{
		grade='B';
		
	}
	else if (avg>=50&&avg<=60) 
	{
		grade='C';
	}
	else if (avg>=40&&avg<=50) 
	{
			grade='D';
	}
	else 
	{
		grade='F';
	}
	    
		System.out.println("hay.."+"shiva.."+"your total marks..."+" "+total+" ...your avg is.."+avg+" "+"....your grade..."+grade);
	}

}
