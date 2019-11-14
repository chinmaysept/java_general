package com.examples;

public class ConvertCharToInteger {
	  public static void main(String[] argv) {
	   /* Character character1 = new Character('a');
	    Character character2 = new Character('b');
	    System.out.println(character2.toString());
	j a  v  a  2 s  .c  om
	    System.out.println(Character.getNumericValue(character2)-9);*/
		  String str = "chinmaya";
		  stringToInteger(str);
		  
	  }
	  
	  public static String stringToInteger(String str) {
		  char [] c = str.toCharArray();
		  int temp = 0;
		  StringBuilder sb = new StringBuilder();
		  for(int i =0; i<c.length; i++) {
			  Character value = new Character(c[i]);
			  temp = value.getNumericValue(c[i]) - 9;
			  sb.append(temp);
		  }
		  System.out.println("The Values of String..."+sb.toString());
		  return sb.toString();
	  }
	}
