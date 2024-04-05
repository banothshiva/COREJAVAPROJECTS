package com.web;

public class ArraySumAndMinAndMaxRowMinAndMaxColomnMinAndMax {

	public static void main(String[] args) {

		int[][] numbers = {{11,22,33},{110,120,130},{101,201,301}};
		int sum = 0;
		for (int[] row : numbers) {
			for (int num : row) {
				sum+=num;
			}
		}
		
		System.out.println("Sum Of An Array Elements "+sum);
		int minValue = numbers[0][0];
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				if (numbers[i][j]<minValue) {
					minValue = numbers[i][j];
				}
			}
		}
        System.out.println("Minimum value in the array: " + minValue);

        int maxValue  = numbers[0][0];
        for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				if (numbers[i][j]>maxValue) {
					maxValue = numbers[i][j];
				}
			}
		}
        System.out.println("Maximum Value In The Array "+maxValue);
        
        
        int rowMin = numbers[0][0];
        for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				if (numbers[i][j]<rowMin) {
					rowMin=numbers[i][j];
				}
			}
		}
        
        System.out.println("Row Wise Minimum Value In The Array "+rowMin );
        
        int rowMax = numbers[0][0];
        for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				if (numbers[i][j]>rowMax) {
					rowMax=numbers[i][j]; 
				}
			}
		}
        System.out.println("Row wise Maximum Value In the Array"+rowMax);
        
        int colMin = numbers[0][0];
        for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				if (numbers[i][j]<colMin) {
					colMin = numbers[i][j];
				}
			}
		}
        System.out.println("Colomn  Wise Minimum Number  is "+colMin);
        
        int colMax = numbers[0][0];
        for (int i = 0; i < numbers.length; i++) {
		   for (int j = 0; j < numbers[i].length; j++) {
			if (numbers[i][j]>colMax) {
				colMax=numbers[i][j];
			}
		}	
		}
        System.out.println("Colomn Wise Maximum Number is "+colMax);
        
	}

}
