package com.examples;

import java.util.Scanner;

public class FizzBuzz {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		getVal(n);
	}
	
	public static void getVal(int n) {
		if(n%15 == 0) {
			System.out.println("FizzBuzz");
		} else if(n%3 == 0) {
			System.out.println("Fizz");
		} else if(n%5 == 0) {
			System.out.println("Buzz");
		}
	}

}
