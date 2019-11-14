package com.examples;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive {
	
	public static void main(String[] args) {
		
		int array [] = {10,11,18,345,342,101,12,13,14,5,6,7,8,9,2};
		array(array);
		
	}
	
	/*public static int longestConsecutive(int[] num) {
		// if array is empty, return 0
		int count = 1;
		if (num.length == 0) {
			return 0;
		}
	 
		Set<Integer> set = new HashSet<Integer>();
		int max = 1;
	 
		for (int e : num)
			set.add(e);
	 
		for (int e : num) {
			int left = e - 1;
			int right = e + 1;
			//count = 1;
	 
			while (set.contains(left)) {
				count++;
				set.remove(left);
				left--;
			}
	 
			while (set.contains(right)) {
				count++;
				set.remove(right);
				right++;
			}
	 
			max = Math.max(count, max);
		}
	 System.out.println(count);
		return max;
	}*/
	
	public static int array(int[] array){
	    int count=0,temp=0;
	    for(int i=0;i<array.length;i++){
	        
	        for(int j=i+1;j<array.length;j++) {
	            if(array[j]-array[i]==1) {
	                count++;
	            }
	         
	        }
	 } 
	    System.out.println(count);
	    return temp+1;
	}

}
