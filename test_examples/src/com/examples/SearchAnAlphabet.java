package com.examples;

public class SearchAnAlphabet {
 
	public static void getAlphabet(String str) {
		int i = str.indexOf("kl");
		if(i != -1) {
			System.out.printf("The '%s' contains the word 'kl'"+ " Index of alphabet:"+i, str);
		} else {
			System.out.println("The alphabet is not found");
		}
	}
	
	public static void main(String[] args) {
		getAlphabet("klean");
	}
}


