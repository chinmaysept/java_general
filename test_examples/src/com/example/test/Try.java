package com.example.test;

import java.util.TreeMap;

public class Try {
	
	static {
		System.out.println("1");
	}
	
	public static void main(String[] args) {
//		float f = \u0038;
//		System.out.println(f);
		int i = 10;
		Try t = new Try();
		t.n(i);
		
		StringBuffer sb = new StringBuffer();
		sb.append("12345678912345678");
		System.out.println(sb.length() + " "+sb.capacity());
		
		TreeMap t1 = new TreeMap();
		
		
	}
	
	public Try() {
		System.out.println("2");
	}
	
	{
		System.out.println("3");
	}
	
	
	 void m(int k) {
		System.out.println(k);
	}
	 
	 void n(Integer k) {
		 m(k);
	 }

}
