package com.tcs;

public class SCP_Heap_Memory {

	public static void main(String[] args) {
	//  == OPERATOR FOR THE PERFORM THE REFERENCE TYPE COMPARISSIONS AND .equals METHOD PERFORM THE DATA COMPARISSIONS 
		//SCP MEMORY
		String str1 = "ratan";
		String str2 = "ratan";
		System.out.println( str1 == str2 );
		System.out.println(str1.equals(str2));
		
		// HEAP MEMORY
		String s1 = new String("ratan");
		String s2 = new String("ratan");
		System.out.println( s1 == s2);
		System.out.println(s1 .equals(s2));
		

	}

}


/*
OUT PUT 
true
true
false
true
*/
