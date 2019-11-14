package com.example.test;

class MyTest {

	static {
		System.out.println("Inside superclass static block");
	}
	
	public MyTest() {
		System.out.println("Inside the constructor of superclass...");
	}
	
	public static String getString(String str) {
		str = "def";
		return str;
	}
	public void show() {
		System.out.println("Inside base class show...");
	}
}

public class MyTest1 extends MyTest {
	
	static {
		System.out.println("Inside subclass static block");
	}
	
	public MyTest1() {
		System.out.println("Inside the subclass constructor...");
	}
	public void show() {
		System.out.println("Inside subclass show...");
	}
	
	public void display() {
		System.out.println("Inside subclass display");
	}
	public static void main(String[] args) {
//		MyTest test = new MyTest1();
//		test.show();
//		MyTest1 test2 = (MyTest1)test;
//		test2.display();
		MyTest test1 = new MyTest();
		
	}
}

