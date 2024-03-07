package com.sathya.cjava.loops.ex;

import java.util.Iterator;

public class OneToTenInReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       for (int i = 10; i>=1; i--) 
       {
		System.out.println(i);
	   }
       System.out.println("***************");
       // print the 15 to 5 -3
       for (int i = 15; i>=5; i-=3)
       {
		System.out.println(i);
	  }
	}

}
