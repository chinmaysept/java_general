package com.test.example;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class SmallestSubstringContainsAllCharacters {
	
	
	
	public static void main(String[] args) {
		Queue<Integer> qe = new LinkedList<Integer>();
		System.out.println(minWindow("ADOBECODEBANC", "ABC"));
		qe.add(1);
		System.out.println(qe.offer(1));
	}
	
	public static String minWindow(String input1, String input2) {
	    if(input2.length()>input1.length()) 
	        return "";
	    String result = "";
	 
	    //character counter for t
	    HashMap<Character, Integer> target = new HashMap<Character, Integer>();
	    for(int i=0; i<input2.length(); i++){
	        char c = input2.charAt(i);    
	        if(target.containsKey(c)){
	            target.put(c,target.get(c)+1);
	        }else{
	            target.put(c,1);  
	        }
	    }
	 
	    // character counter for s
	    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	    int left = 0;
	    int minLen = input1.length()+1;
	 
	    int count = 0; // the total of mapped characters
	 
	    for(int i=0; i<input1.length(); i++){
	        char c = input1.charAt(i);
	 
	        if(target.containsKey(c)){
	            if(map.containsKey(c)){
	                if(map.get(c)<target.get(c)){
	                    count++;
	                }
	                map.put(c,map.get(c)+1);
	            }else{
	                map.put(c,1);
	                count++;
	            }
	        }
	 
	        if(count == input2.length()){
	            char sc = input1.charAt(left);
	            while (!map.containsKey(sc) || map.get(sc) > target.get(sc)) {
	                if (map.containsKey(sc) && map.get(sc) > target.get(sc))
	                    map.put(sc, map.get(sc) - 1);
	                left++;
	                sc = input1.charAt(left);
	            }
	 
	            if (i - left + 1 < minLen) {
	                result = input1.substring(left, i + 1);
	                minLen = i - left + 1;
	            }
	        }
	    }
	 
	    return result;
	}

}
