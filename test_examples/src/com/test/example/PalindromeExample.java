package com.test.example;

public class PalindromeExample{  
	 public static void main(String args[]){  
	  /*int r,sum=0,temp;    
	  int n=373;//It is the number variable to be checked for palindrome  
	  
	  temp=n;    
	  while(n>0){    
	   r=n%10;  //getting remainder 3 , 7, 3 
	   sum=(sum*10)+r;    //3, 37, 373
	   n=n/10;    //37, 3, 0
	  }    
	  if(temp==sum)    
	   System.out.println("palindrome number ");    
	  else    
	   System.out.println("not palindrome");*/
		 int i = 373;
		 
		System.out.println(PalindromeExample.isPalindrome(i));
		 
	}  
	 
	 public static  boolean isPalindrome(int x) {
	        //negative numbers are not palindrome
			if (x < 0)
				return false;
	 
			// initialize how many zeros
			int div = 1;
			while (x / div >= 10) {
				div *= 10;
			}
	 
			while (x != 0) {
				int left = x / div;
				int right = x % 10;
	 
				if (left != right)
					return false;
	 
				x = (x % div) / 10;
				div /= 100;
			}
	 
			return true;
	    }
	}  
