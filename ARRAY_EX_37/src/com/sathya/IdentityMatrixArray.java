package com.sathya;

public class IdentityMatrixArray {

	public static void main(String[] args) {
		int[][] matrix = {{ 1, 0, 0 },
                { 0, 1, 0 },
                { 0, 0, 1 }};
	int count =1;
		boolean flag = false;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = i; j ==i; j++) {
				if (matrix[i][j]==1) {
					count++;
				}
			}
		}
		if (count == 3 ) {
			System.out.println("Identity Matrix");
		}
		else {
			System.out.println("Not  identity matrix");
		}
	}

}
