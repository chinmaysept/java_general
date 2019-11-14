package com.examples;

import java.util.Arrays;

public class CheckArrayPermutation {
	
	    public static int check(int[] A) {

		Arrays.sort(A);

		if (A[0] != 1) {
		    return 0;
		}

		for (int i = 0; i < A.length - 1; i++) {
		    if (A[i] + 1 != A[i + 1]) {
			return 0;
		    }
		}
		return 1;
	    }
	    
	    public static void main(String[] args) {
			int [] a = new int [] {4, 1, 3};
			System.out.println(check(a));
		}

}
