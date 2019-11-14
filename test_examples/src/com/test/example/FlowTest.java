package com.test.example;

public class FlowTest extends MyTest{

	static {
		System.out.println("I am inside the static block of FlowTest...");
	}
	
	public FlowTest() {
		System.out.println("I am inside the costructor of FlowTest...");
	}
	
	{
	  System.out.println("I am inside the initialization block of FloTest...");	
	}
	
	public static void main(String[] args) {
		MyTest t = new FlowTest();
	}
}
