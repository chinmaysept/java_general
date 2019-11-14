/**
 * 
 */
package com.test.example;

import java.util.Scanner;

/**
 * @author cmishra
 *
 */

public class FizzBuzzTest {
	public static void main(String args[]) {
		
		/*for (int i = 1; i <= 50; i++) {
			if (i % (3 * 5) == 0)
				System.out.println("FizzBuzz");
			else if (i % 5 == 0)
				System.out.println("Buzz");
			else if (i % 3 == 0)
				System.out.println("Fizz");
			else
				System.out.println(i);

		}*/
		
		//String palindrome
		
		String original, reverse = "";
	      Scanner in = new Scanner(System.in);
	 
	      System.out.println("Enter a string to check if it is a palindrome");
	      original = in.nextLine();
	 
	      int length = original.length();
	 
	      for ( int i = length - 1; i >= 0; i-- )
	         reverse = reverse + original.charAt(i);
	 
	      if (original.equals(reverse))
	         System.out.println("Entered string is a palindrome.");
	      else
	         System.out.println("Entered string is not a palindrome.");
	}
}
