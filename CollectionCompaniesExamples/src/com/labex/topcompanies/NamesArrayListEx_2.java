package com.labex.topcompanies;

import java.util.ArrayList;
import java.util.List;

public class NamesArrayListEx_2
{
  public static void main(String[] args) 
	{
		List<String>names=new ArrayList<String>();
		names.add("ratan");
		names.add("sathya");
		names.add("chandu");
		names.add("sravya");
		names.add("anu");
		names.add("raju");
		names.add("rani");
		// printing the length of the names
		System.out.println(names.size());
		//print the first name 
		String st1=names.get(0);
		// printing the all the names
		for (String name : names) 
		{
		System.out.println(name);
	    }
		System.out.println("*******");
		//removing the raju from the list
		String remove = names.get(indexOf("raju"));
		System.out.println(remove);
	}

private static int indexOf(String string) {
	// TODO Auto-generated method stub
	return 0;
}


}
