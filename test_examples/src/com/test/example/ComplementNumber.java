package com.test.example;

import java.util.Scanner;

public class ComplementNumber {
	
	private static int integerComplement(int n){

		  String binaryString = Integer.toBinaryString(n);

		  String temp = "";
		  for(char c: binaryString.toCharArray()){
		      if(c == '1'){
		          temp += "0";
		      }
		      else{
		          temp += "1";
		      }
		  }
		  int base = 2;
		  int complement = Integer.parseInt(temp, base);
          System.out.println("The complemented value: "+complement);
		  return complement;
		}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int value = scan.nextInt();
		integerComplement(value);
	}

}
