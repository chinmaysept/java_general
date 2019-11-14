package com.test.example;

import java.util.HashSet;
import java.util.Set;

public class LongestCommonSubstring {

	public static int find(char[] A, char[] B) {
		int[][] LCS = new int[A.length + 1][B.length + 1];
		// if A is null then LCS of A, B =0
		for (int i = 0; i <= B.length; i++) {
			LCS[0][i] = 0;
		}

		// if B is null then LCS of A, B =0
		for (int i = 0; i <= A.length; i++) {
			LCS[i][0] = 0;
		}

		// fill the rest of the matrix
		for (int i = 1; i <= A.length; i++) {
			for (int j = 1; j <= B.length; j++) {
				if (A[i - 1] == B[j - 1]) {
					LCS[i][j] = LCS[i - 1][j - 1] + 1;
				} else {
					LCS[i][j] = 0;
				}
			}
		}
		int result = -1;
		for (int i = 0; i <= A.length; i++) {
			for (int j = 0; j <= B.length; j++) {
				if (result < LCS[i][j]) {
					result = LCS[i][j];
				}
			}
		}
		return result;
	}
	
	public static Set<String> longestCommonSubstrings(String s, String t) {
	    int[][] table = new int[s.length()][t.length()];
	    int longest = 0;
	    Set<String> result = new HashSet<>();

	    for (int i = 0; i < s.length(); i++) {
	        for (int j = 0; j < t.length(); j++) {
	            if (s.charAt(i) != t.charAt(j)) {
	                continue;
	            }

	            table[i][j] = (i == 0 || j == 0) ? 1
	                                             : 1 + table[i - 1][j - 1];
	            if (table[i][j] > longest) {
	                longest = table[i][j];
	                result.clear();
	            }
	            if (table[i][j] == longest) {
	                result.add(s.substring(i - longest + 1, i + 1));
	            }
	        }
	    }
	    return result;
	}

	public static void main(String[] args) {
		String A = "Hello";
		String B = "Mello";
		/*System.out.println("LCS length : "
				+ find(A.toCharArray(), B.toCharArray()));*/
		System.out.println(longestCommonSubstrings(A,B));
	}

}
