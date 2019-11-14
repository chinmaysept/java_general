package com.examples;

public class ConvertWordToNumber {

	public static int getIntVal(String str) throws ArrayIndexOutOfBoundsException {
		
		
		int actVal = 0;
		String [] token = str.split(" ");
		for (int i=0; i <= token.length; i++ ) {
			String str1 = token[i];
			switch(str1) {
			case "one":
				str1="1";
			    break;
			case "two":
				str1 = "2";
				break;
			case "three":
				str1 = "3";
				break;
			case "four":
				str1 = "4";
				break;
			case "five":
				str1 = "5";
				break;
			}
			actVal = Integer.parseInt(str1);
			System.out.println("Actual value:"+actVal);
		}
		
		return actVal;
	}
	
	public static void main (String [] args) {
		try{
		getIntVal("Four");
		}catch(ArrayIndexOutOfBoundsException e) {
			e.getMessage();
		}
	}
}
