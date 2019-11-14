package com.examples;

import java.util.HashSet;

public class OddOccurences {

	/*public static int oddOcc(int[] A) {
		Arrays.sort(A);
		int i, j, count = 0;
		for (i = 0; i < A.length; i++) {
			for (j = i + 1; j < A.length; j++) {
				if (A[i] == A[j])
					count++;
				else
					break;
			}
			if (count % 2 == 0)
				return A[i];
			else {
				count = 0;
				i = j - 1;
			}
		}
		return 0;

	}*/
	
	/*public static int solution(int[] A) {
		// write your code in Java SE 8
		int elem = 0;

		for (int i = 0; i < A.length; i++) {
			elem ^= A[i];
		}
		return elem;
	}*/
	
	// Time: O(N)
	// Space: O(N)
	/*public static int solution2(int[] A) {
		// write your code in Java SE 8
		HashSet<Integer> dups = new HashSet<Integer>();
		int elem = -1;

		for (int i = 0; i < A.length; i++) {
			if (dups.add(A[i])) {
				elem = A[i];
			}
		}
		return elem;
	}*/

	// Time: O(N^2)
	// Space: O(1)
	/*public static int solution3(int[] A) {
		// write your code in Java SE 8
		for (int i = 0; i < A.length; i++) {

			for (int j = 0; j < A.length; j++) {
				if (A[i] == A[j] && i != j) {
					A[i] = -1;
					A[j] = -1;
					j = A.length;
				}
			}
		}

		for (int i = 0; i < A.length; i++) {
			if (A[i] != -1)
				return A[i];
		}

		return 0; // should never happen
	}*/
	
	public static int soln(int [] a) {
		int i=0; int res = 0;
		for(i=0;i<a.length;i++) {
			res = res^a[i];
			
		}
		return res;	
	}
	
	public static void main(String[] args) {
		int [] a = new int [] {9,3,9,3,9,7,9};
		System.out.println(soln(a));
		
		
	}

}
