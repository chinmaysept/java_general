package com.examples;

import java.util.Scanner;

public class FibonacciSeries {
	
	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		int prev,next,sum;
//		sum = 0;
//		prev=next=1;
//		for(int i=1; i<=n; i++) {
//			System.out.print(prev+" ");
//			sum = prev+next;
//			prev = next;
//			next=sum;
		
//		}
		
		float flVal = 2.3f;
		double doubVal = 2.7;
		int finVal = (int)Math.ceil(doubVal)*(int)Math.round(flVal);
		
		System.out.println("The final integer value:"+finVal);
		
	}

}
