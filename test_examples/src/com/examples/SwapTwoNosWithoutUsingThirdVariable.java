package com.examples;

import java.util.Scanner;

public class SwapTwoNosWithoutUsingThirdVariable {
	
	public static void main (String [] args){
		getVariables(50,100);
		
//		Scanner scan = new Scanner(System.in);
//		
//		int nextVal = scan.nextInt();
//		
//		System.out.println(nextVal);
		
	}
	
	public static void getVariables(int a, int b) {
		/*a= a+b;
		b=a-b;
		a=a-b;*/
		a = a^b; //now a is 6 and b is 4
		b = a^b; //now a is 6 but b is 2 (original value of a)
		a = a^b; //now a is 4 and b is 2, numbers are swapped

		System.out.println("The Value of a:"+a+" "+"\n"+"The value of b:"+b);
	}

}
