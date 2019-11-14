package com.test.lambda.stream;

import java.util.stream.IntStream;

public class LambdaEx1 {
	
	public static void main(String[] args) {
		System.out.println(isPrime(1));
		System.out.println(isPrime(2));
		System.out.println(isPrime(3));
		System.out.println(isPrime(4));
	}
	
	private static boolean isPrime(int number) {
		/*for(int i = 2; i<number; i++) {
			if(number%2 == 0) return false ;
		}
		return number >1;*/
		return number>1 &&
				        IntStream.range(2, number)
				                 .noneMatch(index -> number % index == 0);
	}

}
