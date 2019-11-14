package com.test.example;


class Test5 {
	public void m1(int i, float f) {
		System.out.println("Base class Test5...");
	}
}

public class Test4 extends Test5 {
	
	public void m1(float f, int i) {
		System.out.println("Subclass Test4...");
	}
 
	public static void main(String[] args) {
		Test5 t1 = new Test4();
		t1.m1(1, 1);
	}
}
