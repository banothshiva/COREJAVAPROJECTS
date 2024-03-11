package com.sathya.corejava;

public class TabelPrinting 
{
	
	    public static void main(String[] args) {
	        // Define the size of the multiplication table
	        int tableSize = 5;

	        // Outer loop for the multiplicand
	        for (int i = 1; i <= tableSize; i++) {
	            // Inner loop for the multiplier
	            for (int j = 1; j <= tableSize; j++) {
	                // Calculate the product and print it
	                int product = i * j;
	                System.out.print(product + "\t"); // Use \t for tab spacing
	            }

	            // Move to the next line after completing a row
	            System.out.println();
	        }
	    }
	}
