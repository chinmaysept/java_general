package com.cognizant.interview;

public class ArrayReverseWithoutNewArray {
 
	public static int[] reverseArrayWithoutTempArray(int[] array) {
	    int i = 0, 
	    j = array.length - 1;
	    int temp = 0;
	    for (i = 0; i < array.length / 2; i++, j--) {
	        temp = array[i];
	        array[i] = array[j];
	        array[j] = temp;
	    }
	    for(int k : array) {
	    	System.out.print(k + " ");
	    }
	    return array;
	}
	
	public static void main(String[] args) {
		int [] b = new int [] {1,2,3,4,5};
		reverseArrayWithoutTempArray(b);
	}
}
