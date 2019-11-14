package com.test.example;

public class MyTest {
	
	static {
		System.out.println("I am inside the static block of MyTest...");
	}
	
	public MyTest() {
		System.out.println("I am inside the constructor of MyTest...");
	}
	
	{
		System.out.println("I am inside the initialization block of MyTest...");
	}

}
