package com.codility.examples;

public class ArrayToSquareMatrix {
	
	public static int[][] toM2(int[] array, int a) {
		int[][] matrix = new int[(array.length + a - 1) / a][];
	    int rowStart = 0;
	    for (int i = 0; i < array.length; i++) {
	        int row = i/a;
	        if (matrix[ row ] == null) {
	            matrix[ row ] = new int[ Math.min( a, array.length-rowStart) ];
	            rowStart += a;
	        }
	        matrix[ row ][i % a] = array[i];
	    }
	    return matrix;
	}
	
	public static void main(String[] args) {
		int [] a = new int[] {1,2,3,4,5,6};
		int b = 4;
		int [][] c = toM2(a, b);
		for(int i = 0; i< c.length; i++) {
			for(int j=0; j<4; j++) {
			System.out.println(c[i][j] + "\t");
			}
			System.out.println();
		}
		
	}

}
