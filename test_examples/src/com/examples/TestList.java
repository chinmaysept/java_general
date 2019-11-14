package com.examples;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestList {
	
	
	
	public static void main(String[] args) {
		List<String> li = new ArrayList();
		
		li.add("A");
		li.add("B");
		li.add("C");
		li.add(1, "D");
		
		System.out.println(li);
		
		
	}

}
