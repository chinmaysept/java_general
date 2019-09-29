package com.algo.examples;

public class ReverseArray {
	
	private static void printArray(int [] arr , int n) {
		if (n == 0)
			return;
		else {
			System.out.print(arr[arr.length - n] + " ");
			printArray(arr, n-1);
			
		}
	}
	
	
	
	public static void printReverseArr(int [] arr, int n) {
		if (n == 0)
			return;
		else {
			//System.out.println("value of n:"+n);
			printReverseArr(arr, n-1);
			
			System.out.print(arr[arr.length - n] + " ");
		}
	}
	
	public static void main(String[] args) {
		int a [] = {1,2,3,4,5};
		int b = a.length;
		
		printArray(a, a.length);
		System.out.println("\n");
		printReverseArr(a, a.length);
	}
	
}
