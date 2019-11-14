package com.examples;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		boolean isPrime = true;
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i=2; i<=n/2; i++) {
			int res = n%i;
			if(res == 0) {
				isPrime = false;
				break;
			}
		}
		if(isPrime) {
			System.out.println("It is prime.."+n);
		} else {
			System.out.println("It is not prime.."+n);
		}
	}
}
