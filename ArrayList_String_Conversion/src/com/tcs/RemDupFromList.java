package com.tcs;

import java.util.ArrayList;
//import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class RemDupFromList
{
	// Execution starts from here 
	public static void main(String[] args)
	{
		// create the array list object
		ArrayList list = new ArrayList() ;
		
		//giving the duplicate data 
		list.add("one");
		list.add("two");
		list.add("theree");
		list.add("one");	 //duplicate value
		list.add("one");   //duplicate value
		
		// to print the size of the input 
		System.out.println(list.size());
		
		// HASHSET IS NOT PRINT DATA IN ORDER IT IS PRINTED IN RANDOM ONLY
		 // ArrayList  li1 = new ArrayList(new HashSet(list)); //no oreder
		
		ArrayList li2 = new ArrayList(new LinkedHashSet(list));  //to preserve the values into the form order then you should use the LinkedHasSet
		
		Iterator iterator = li2 .iterator();
		while (iterator.hasNext())
		{
			System.out.println(iterator.next());
			
		}
	}

}
