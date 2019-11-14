package com.test.example;

import java.util.HashSet;
import java.util.Set;
 
public class MyLongestSubstring {
 
    private Set<String> subStrList = new HashSet<String>();
    private int finalSubStrSize = 0;
     
    public Set<String> getLongestSubstr(String input){
        //reset instance variables
        subStrList.clear();
        finalSubStrSize = 0;
        // have a boolean flag on each character ascii value
        boolean[] flag = new boolean[256];
        int j = 0;
        char[] inputCharArr = input.toCharArray();
        for (int i = 0; i < inputCharArr.length; i++) {
            char c = inputCharArr[i];
            if (flag[c]) {
                extractSubString(inputCharArr,j,i);
                for (int k = j; k < i; k++) {
                    if (inputCharArr[k] == c) {
                        j = k + 1;
                        break;
                    }
                    flag[inputCharArr[k]] = false;
                }   
            } else {
                flag[c] = true;
            }
        }
        extractSubString(inputCharArr,j,inputCharArr.length);
        return subStrList;
    }
     
    private String extractSubString(char[] inputArr, int start, int end){
         
        StringBuilder sb = new StringBuilder();
        for(int i=start;i<end;i++){
            sb.append(inputArr[i]);
        }
        String subStr = sb.toString();
        if(subStr.length() > finalSubStrSize){
            finalSubStrSize = subStr.length();
            subStrList.clear();
            subStrList.add(subStr);
        } else if(subStr.length() == finalSubStrSize){
            subStrList.add(subStr);
        }
         
        return sb.toString();
    }
    
    public static int longestConsecutive(int[] num) {
    	// if array is empty, return 0
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
    		int count = 1;
     
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
     System.out.println(max);
    	return max;
    }
 
    public static void main(String a[]){
        MyLongestSubstring mls = new MyLongestSubstring();
//        System.out.println(mls.getLongestSubstr("java2novice"));
//        System.out.println(mls.getLongestSubstr("java_language_is_sweet"));
//        System.out.println(mls.getLongestSubstr("java_java_java_java"));
//        System.out.println(mls.getLongestSubstr("abcabcbb"));
        int [] ab =  {1,2,4,6,24,8,67,68};
        mls.longestConsecutive(ab);
        
    }
}
