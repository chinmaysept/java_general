package com.test.example;

public class SubsequnceString {
	public final  char[] value;
	public SubsequnceString() {
		value = new char[0];
	}
	
	public static void main(String[] args) {
		String str = "abc";
		System.out.println(str.subSequence(0, 1));
	}

}
