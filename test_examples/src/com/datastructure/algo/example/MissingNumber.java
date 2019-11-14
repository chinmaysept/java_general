package com.datastructure.algo.example;

import java.util.ArrayList;

public class MissingNumber {
	
	public static void missingValue() {
//		int sum = 0;
//		int idx = -1;
//		for (int i = 0; i < arr.length; i++)
//		{
//		    if (arr[i] == 0)
//		    {
//		         idx = i; 
//		    }
//		    else 
//		    {
//		         sum += arr[i];
//		    }
//		}
//
//		// the total sum of numbers between 1 and arr.length.
//		int total = (arr.length + 1) * arr.length / 2;
//
//		System.out.println("missing number is: " + (total - sum) + " at index " + idx);
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int a[] = { 1,3,4,5,6,7,10, 11, 13 };
		int j = a[0];
		for (int i=0;i<a.length;i++)
		{
		    if (j==a[i])
		    {
		        j++;
		        continue;
		    }
		    else
		    {
		        arr.add(j);
		        i--;
		    j++;
		    }
		}
		System.out.println("missing numbers are ");
		for(int r : arr)
		{
		    System.out.print(" " + r);
		}

	}
	
	public static void main(String[] args) {
		missingValue();
	}

}
