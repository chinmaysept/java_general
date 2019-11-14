package com.examples;

public class SumOfIntegers {

	public static void main(String[] args) {
		int [] a = new int [] {5,1,2,3,4,5};
		int temp = 0;
		for(int i=0; i<a.length; i++) {
			temp += a[i];
		}
		System.out.println("The sum of all integers in the array::"+temp);
	}
}
