package com.examples;

public class SecondHighestNumberInArray {

	public static void main(String[] args) {
		int [] a = {1,7,9,65,45,77,77,101,43,47};
		getSecHighestVal(a);
	}
	
	public static void getSecHighestVal(int[] a) {
		int maxVal = 0;
		int secMaxVal = 0;
		for(int i=0; i<a.length; i++) {
			if(a[i] > maxVal) {
				secMaxVal = maxVal;
				maxVal = a[i];
			}
			
			if(secMaxVal > maxVal) {
				maxVal = a[i];
			}
			
			if(secMaxVal == maxVal) {
				maxVal = a[i];
			}
		}
		System.out.println("The second highest value is "+secMaxVal);
	}
}
