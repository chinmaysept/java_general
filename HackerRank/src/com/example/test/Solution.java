package com.example.test;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
       // int n = in.nextInt();
       // int arr[] = new int[n];
        int sum = 0;
        int [] arr = new int [] {1, 2, 3, 4, 10, 11}; 
        for(int i = 0; i < arr.length; i++) {
        	sum += arr[i];
        }
         System.out.println(sum);        
    }
}
