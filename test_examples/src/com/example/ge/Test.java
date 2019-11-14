package com.example.ge;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
	
	public static void main( String args[] ){

		 String str = "Ra566767shmimnjnjRashmioxkx$%";
	        Pattern pattern = Pattern.compile("\\W");
	        Matcher  matcher = pattern.matcher(str);

	        int count = 0;
	        while (matcher.find())
	            count++;

	        System.out.println(count);
	    }
	}
