package com.datastructure.algo.example;

public class FindElementInSortedArray {
	
    public static void findElement(int [] a, int b) {
    	//int[] a = {3, 7, 10, 15, 91, 110, 150}; // a sorted array not containing duplicates
    	 // the element to be searched
    	int left = 0;
    	int middle;
    	int right = a.length - 1;
    	while (left <= right) {
    	    middle = (left + right) / 2;
    	    if (a[middle] == b) {
    	        System.out.println("Element found at index " + middle);
    	        break;
    	    } else if (a[middle] < b) {
    	        left = middle + 1;
    	    } else if (a[middle] > b) {
    	        right = middle - 1;
    	    }
    	}
    	
    }
    
    public static void main(String[] args) {
    	int [] arr = {1, 3, 7, 11, 16};
    	findElement(arr, 16);
	}
}
