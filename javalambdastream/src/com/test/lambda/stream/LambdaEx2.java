package com.test.lambda.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LambdaEx2 {
	
	public static void main(String[] args) {
		//find the double of the first even numb er greater than 3
		List<Integer> values = Arrays.asList(1,2,3,5,6,8,4,7,8,9,10);
		
		Stream<Integer> temp = values.stream()
			      //.filter(e -> e>3)
					.filter(LambdaEx2::isGreaterThan3)
					//.filter(e -> e%2==0)
			      .filter(LambdaEx2::isDivisibleByEvenNumber)
			      //.map(e -> e*2)
			      .map(LambdaEx2::doubleIt);
//		         temp.findFirst().get();
		
//		System.out.println(
//				values.stream()
//		      //.filter(e -> e>3)
//				.filter(LambdaEx2::isGreaterThan3)
//				//.filter(e -> e%2==0)
//		      .filter(LambdaEx2::isDivisibleByEvenNumber)
//		      //.map(e -> e*2)
//		      .map(LambdaEx2::doubleIt)
//		      temp.findFirst()
//		      .get());
	}
	
	public static boolean isGreaterThan3(int number) {
		System.out.println("isGreaterThan3 "+number);
		return number >3;
	}
	
	public static boolean isDivisibleByEvenNumber(int number) {
		System.out.println("isDivisibleByEvenNumber "+number);
		return number%2 == 0;
	}
	
	public static int doubleIt(int number) {
		System.out.println("doubleIt "+number);
		return number*2;
	}

}
