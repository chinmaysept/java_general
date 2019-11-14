package com.loop.pattern;

import java.util.Scanner;

public class Diamond {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	    int input=in.nextInt();
	    int spac=input-1;
	    int min=1;
	    int max=input;
	    for(int i=0;i<input;i++){
	        for(int k=spac ; k>i;k--){
	            System.out.print(" ");
	        }
	        for(int j=0;j<min;j++){
	            System.out.print("*");
	        }
	        min+=2;
	        System.out.println();
	    }
	    for(int m=input-1;m>0;m--){
	        for(int n=spac;n>=m;n--){
	            System.out.print(" ");
	        }
	        for(int q=0;q<m;q++){
	            System.out.print("*");
	        }
	        for(int s=0;s<m-1;s++){
	            System.out.print("*");
	        }
	        System.out.println();
	    }
	}
}
