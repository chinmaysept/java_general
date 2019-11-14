package com.datastructure.algo.example;

public class CyclicArray {
	
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6}; 
		rotate(arr, 2);
	}
	
	public static void rotate(int[] arr, int order) {	
		if (arr == null || arr.length==0 || order < 0) {
			throw new IllegalArgumentException("Illegal argument!");
		}
	 
		if(order > arr.length){
			order = order %arr.length;
		}
	 
		//length of first part
		int a = arr.length - order; 
	 
		reverse(arr, 0, a-1);
		reverse(arr, a, arr.length-1);
		reverse(arr, 0, arr.length-1);
		for(int array: arr) {
			System.out.print(array + " ");
		}
	 
	}
	 
	public static void reverse(int[] arr, int left, int right){
		if(arr == null || arr.length == 1) 
			return;
	 
		while(left < right){
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}	
	}

}
