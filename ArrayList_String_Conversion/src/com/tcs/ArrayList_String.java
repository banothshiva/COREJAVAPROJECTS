package com.tcs;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_String 
{

	public static void main(String[] args)
	{
		// create the array list object 
		List al = new ArrayList <String>();
		
		// ADDING DATA FOR THE LIST 
		al.add("one ");
		al.add("two");
		al.add("three");
		al.add("four");
		al.add("five");
		System.out.println(al.size());
		
		// creating the string array object 
		String[] StringArrayObject = new String[al.size()];
		al.toArray(StringArrayObject);
		
		for(String temp : StringArrayObject )		
		{
			System.out.println(temp);
		}
	}

}
