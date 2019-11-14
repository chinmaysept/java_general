package com.examples;

public class StringReverse {
	String str2 = "";

	public  String reverseString(String str) {
		
		if (str.length() == 1) {
			return str;
		} else {
			str2 += str.charAt(str.length() - 1)
					+ reverseString(str.substring(0, str.length() - 1));
			
			return str2;
		}

	}

	public static void main(String[] args) {
		
		StringReverse sr = new StringReverse();
		System.out.println(sr.reverseString("abc"));
	}

}
