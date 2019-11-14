package com.algo.examples;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ThreeSumZeroArray {

	public static void main(String[] args) {
		int[] a = { 0, 1, 2, 9, 7, -3, -4, -1, -8, 5, 14, 17 };

		Set<Integer> hs = new HashSet<>();
		for (int i = 0; i < a.length; i++) {
			hs.add(a[i]);
		}
		int[] b = new int[hs.size()];
		Object[] arr = hs.toArray();
		System.out.println("The array is:");

		for (int j = 0; j < arr.length; j++) {

			b[j] = (Integer) arr[j];
		}

		for (int c : b) {
			System.out.println(c);
		}

		find(b);
	}

	/*
	 * private static void find(int[] nums, int i) { Set<Integer> s1 = new
	 * TreeSet<>(); Set<Integer> s2 = null; if (i >= nums.length - 3) { return;
	 * }
	 * 
	 * for (int a = i; a < nums.length; a++) { if (a + 1 < nums.length && a + 2
	 * < nums.length) { if (nums[a + 1] + nums[a + 2] == -nums[a]) { s2 = new
	 * TreeSet<>(); s2.add(nums[a]); s2.add(nums[a + 1]); s2.add(nums[a + 2]);
	 * s1.addAll(s2); System.out.println(nums[a] + " " + nums[a+1] + " " +
	 * nums[a+2]); find(nums, i + 1); } } } }
	 */

	/*
	 * public static void find(int [] x){ Arrays.sort(x); for (int i = 0; i
	 * <x.length ; i++) { int a = x[i]; //now problem is reduced to find two
	 * numbers in an array whose sum = -a
	 * 
	 * int sum = -a; int start = i + 1; int end = x.length-1; while(start<end){
	 * int tempSum = x[start] + x[end]; if(tempSum==sum){
	 * System.out.println("Found 3 elements whose sum is = 0");
	 * System.out.println("Elements are " + a + " " + x[start]+ " " + x[end]);
	 * return; }else if(tempSum<sum) start++; else //tempSum>sum end--; } } }
	 */

	/*
	 * public static void find(int [] x){ for (int i = 0; i <x.length ; i++) {
	 * int a = x[i]; HashSet<Integer> set = new HashSet<Integer>();
	 * 
	 * for (int j=i+1; j<x.length; j++) { int b = x[j]; int c = -(a+b);
	 * if(set.contains(c)){
	 * System.out.println("Found 3 elements whose sum is = 0");
	 * System.out.println("Elements are " + a + " " + b + " " + c); return;
	 * }else set.add(b); } } }
	 */

	public static void find(int[] x) {

		for (int i = 0; i < x.length; i++) {
			for (int j = i + 1; j < x.length; j++) {
				for (int k = j + 1; k < x.length; k++) {
					if (x[i] + x[j] + x[k] == 0) {
						System.out.println(x[i] + " " + x[j] + " " + x[k]);
						
					}
				}
			}
		}
	}

}
