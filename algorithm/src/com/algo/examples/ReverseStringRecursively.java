package com.algo.examples;

public class ReverseStringRecursively {
	
	
    public static String reverse(char[] input, int idx){
    	int cur = 0;
        int revIdx = 0;
        char[] result = null;
        if(idx >= input.length){
            cur = idx;
            result = new char[cur];
            return null;
        }
        reverse(input , idx + 1);
       
        if(idx < input.length){
            result[revIdx ++] = input[idx];
        }
        
        return  new String(result);
    	
    }
    
    private static void printArray(char [] arr , int n) {
    	if(n == 0)
    		return;
    	else {
    		printArray(arr, n-1);
    		System.out.print(arr[arr.length - n] + " ");
    	}
    }
    
    public static void main(String[] args) {
		String  a = "Sidharth";
		char [] b = a.toCharArray();
		//System.out.print("\n");
		//printArray(b, b.length);
		System.out.println(reverse(b, b.length));
	}

}
