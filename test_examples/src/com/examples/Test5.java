package com.examples;

public class Test5 extends Test3 {

	public static void main(String[] args) {
		Test5 t = new Test5();
		t.m1();
	}
}

class Test3 {
	
	protected void m1() {
		System.out.println("Inside m1 in super class");
	}
	
}
