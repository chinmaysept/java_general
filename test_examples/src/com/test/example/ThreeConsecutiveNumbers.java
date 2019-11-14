package com.test.example;

import java.util.Arrays;
import java.util.HashSet;

public class ThreeConsecutiveNumbers {
	
	public static boolean consecutiveThreeNumbers(int[] arr) {
		boolean value = false;
		int count = 0;
		/*int count = 0;
		 * 
		if (arr.length != count) {//make sure the correct number of numbers was sent in
	        return false;
	    }*/
	    Arrays.sort(arr);//guarantee order to simplify logic

	    for (int i = 1; i < arr.length; i++) {
	        //compare this num to the previous num, make sure its exactly 1 greater
	        if (arr[i] != arr[i - 1] + 1) {
	        	
	            return value = false;
	        } else
	        	System.out.println(count++);
	        	
	    }
	    System.out.println(value +" "+ count);
	    return value = true;
	}
	
	public static int longestConsecutive(int[] num) {
        // if array is empty or contains 1 eleme
        if (num.length == 0 || num.length == 1) return num.length;
         
        HashSet<Integer> set = new HashSet<Integer>();
        int max = 1;
         
        // add array elements into the hash set
        for (int i : num)
            set.add(i);
         
        // For each array element, check consecutive sequence
        for (int i : num) {
            int left = i - 1;
            int right = i + 1;
            int count = 1;
             
            // check left consecutive sequence
            while (set.contains(left)) {
                count++;
                set.remove(left);
                left--;
            }
             
            // check right consecutive sequence
            while (set.contains(right)) {
                count++;
                set.remove(right);
                right++;
            }
             
            max = Math.max(count, max);
            
        }
        System.out.println(max);
        return max;
    }
	
	public static void main(String[] args) {
		int [] arr = {1,5,2,4,3,6};
		longestConsecutive(arr);
	}

}
