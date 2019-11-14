package com.examples;

public class SmallestValue {
	
	public static void main(String[] args) {
		int [] a = new int [] {7,3,5,4,2,0,7,5};
		System.out.println(getMinVal(a));
	}
	
	public static int getMinVal(int[] a) {
		int min = a[0];
		for(int i=0; i<a.length; i++) {
			if( min > a[i]) {
				min = a[i];
			}
			
	      
		}
		return min;
	}
}
