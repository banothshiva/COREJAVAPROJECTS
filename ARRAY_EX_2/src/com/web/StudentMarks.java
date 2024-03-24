package com.web;

public class StudentMarks
{

	public static void main(String[] args)
	{
		String[] names;			//DECLARATION
		names = new  String[5];   //INSTANTION
		names[3] = "ratan";			//INTIALIZATION
		//PRINTING THE DATA 
		for (String name  : names) 
		{						        	//OUTPUT COMES WITH THE NULL VALUES 
			System.out.println(name);                              
	     }
		System.out.println("--------------------");
		int[] marks;
		marks = new int[5];         //INTERNALLY MARKS ARE TAKING 0 THEN WE ARE UPDATING WITH
										// THE 89,99 AND WE PERFORMING SOME UPDATION
		marks[2]=89;
		marks[3]=99;
		for (int mark : marks) 
		{
			System.out.println(mark);
		}
	}

}
