package com.examples;

public class RemoveDuplicatesUnsortedArray {
	
	public static void main(String[] args) {
		int[] input = new int[]{1, 14, 13, 11, 9, 7, 6, 2, 22, 111,1,3,14,11,14};
		removeDuplicates(input);
	}
	
	public static int[] removeDuplicates(int[] arr) {
	    boolean[] set = new boolean[1001]; //values must default to false
	    int totalItems = 0;

	    for (int i = 0; i < arr.length; ++i) {
	        if (!set[arr[i]]) {
	            set[arr[i]] = true;
	            totalItems++;
	        }
	    }

	    int[] ret = new int[totalItems];
	    int c = 0;
	    for (int i = 0; i < set.length; ++i) {
	        if (set[i]) {
	            ret[c++] = i;
	        }
	    }
	    for(int i =0; i<ret.length; i++) {
	    	System.out.print(" " + ret[i]);
	    }
	    return ret;
	}

}
