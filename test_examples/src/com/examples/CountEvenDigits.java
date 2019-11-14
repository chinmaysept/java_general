package com.examples;

import java.util.Scanner;

public class CountEvenDigits {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count = 0;

		while (n > 0) {

		    if ((n%10)==0) {
		       count++;
		    }
		    else if (n%2==0) { 
		       count++;
		    }

		    n /= 10;
		}
		System.out.println("Number is even"+count);
	}


}
