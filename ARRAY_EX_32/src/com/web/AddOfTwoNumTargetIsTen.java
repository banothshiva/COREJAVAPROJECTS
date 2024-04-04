package com.web;

public class AddOfTwoNumTargetIsTen {

	public static void main(String[] args) {
	
		int[] a = {2,4,5,6,8,7,3};
		int target=10;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]+a[j]==target) {
					  // Output the pair of indices where the elements sum up to the target
                    System.out.println("Indices: " + i + " and " + j);
                    // Output the actual elements along with their sum for clarity
                    System.out.println("Elements: " + a[i] + " + " + a[j] + " = " + target);
                }
			}
		}

	}

}
