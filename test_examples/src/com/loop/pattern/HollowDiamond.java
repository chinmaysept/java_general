package com.loop.pattern;

public class HollowDiamond {

	public static void main(String[] args) {
		String st1="*";
	    int a = 0;
	   for(int i = 5;i >= 1;i--){
	       for(int j = 1;j <= 9;j++){
	        if(j == i || (10 - i) == j)
	            {
	            System.out.print(st1.charAt(a));  //needs change
	        }
	        else {
	            System.out.print(' ');
	        }
	        }
	     System.out.println();
	    }
	    for(int i =2;i <= 5;i++){
	       for(int j = 1;j <= 9;j++){
	        if(j == i || (10 - i) == j){
	            System.out.print(st1.charAt(a));   //needs change
	        }
	        else
	             {
	            System.out.print(' ');
	        }
	        }
	     System.out.println();
	    }  
	}

}
