package com.biggestNumbersEx1;

import java.util.Scanner;

public class StudentsAvgMarksEx_6
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int total;double avg;
		//create Scanner object
		Scanner s=new Scanner(System.in);
		//read the data from cmd prompt
		System.out.println("enter student name...");    //shiva
		String name =s.next();
		System.out.println("enter student rollno");     //123
	    int rollno	=s.nextInt();
	    System.out.println("enter science marks");  //65
	    int science	=s.nextInt();
	    System.out.println("enter science marks");  //75
	    int social	=s.nextInt();
	    System.out.println("enter maths marks");  //80
	    int maths=s.nextInt();
	    total=science+social+maths;              //240
	    avg=total/3;
	
	if(avg>50)
	{   System.out.println("student name..."+name);
      	System.out.println("student rollno..."+rollno);
	    System.out.println("student total marks..."+total);
	    System.out.println("congratulationsyou passed with avg score of.."+avg);
	}
	else {
		
		System.out.println("student name..."+name);
		System.out.println("student rollno..."+rollno);
		System.out.println("student total marks..."+total);
		System.out.println("sorry you failed with avg score of.."+avg);
	     }
	}
 }
	
 


