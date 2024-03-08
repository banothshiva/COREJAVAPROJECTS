package com.sathya.corejava;

public class Patterns {
  public static void main(String[] args) 
	{
	
	 for (int row = 1; row <=5; row++) 
	   {
		 for (int column = 1; column <= row; column++)
		 {
			System.out.print("* "+" ");
	     }
		System.out.println();
	  }
	 
	 System.out.println("*******************************");
	 
	 
	 for (int row = 1; row <= 5; row++) 
	 {
		 for (int col = 1; col <= row ; col++) 
		 {
			System.out.print("@ "+" ");
		}
		System.out.println();
	}
          System.out.println("*****************************");
          
          for (int row= 1; row <= 5; row++)
          {
        	  for (int col = 1; col <=row; col++) 
        	  {
				System.out.print("# "+" ");
			  }
        	  System.out.println();
			
	    }
          System.out.println("**********************");
          for(int row=1;row<=5;row++) {
        	  for( int col=1;col<=row;col++) {
        		  System.out.print("A"+" ");
        	  }
        	  System.out.println();
          }
          System.out.println("**********************");
          for(int row=1;row<=5;row++) {
        	  for(int col=1;col<=row;col++) {
        		  System.out.print("1"+" ");
        	  }
        	  System.out.println();
          }
          System.out.println("*********************");
          for (int row = 1; row <=5; row++){
        	  for (int col = 1; col <= row; col++) {
				System.out.print(row+" ");
			}
        	  System.out.println();
			
		}
          System.out.println("************");
	
	for( int  row = 1;row <= 5 ; row++) {
		for( int col = 1 ; col<=row ; col++) {
			System.out.print(col+" ");
		}
		System.out.println();
	}
	System.out.println("**************");
		
  for (int row = 1; row <=5; row++) 
	{
		for (int col = 1; col <=5; col++) 
	     {
			System.out.print("*");
	     }
		 System.out.println();
     }
    
	
	
  for (int row = 1; row <= 5; row++)
	{
	  for (int col = 5; col <= row; col--) 
	  {
		System.out.print("* ");
	  }
	  System.out.println();
	}
}
	
}