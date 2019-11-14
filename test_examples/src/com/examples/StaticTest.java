package com.examples;

class StaticTest1 {
	public static void m1() {
		System.out.println("Inside base class m1");
	}
}

public class StaticTest extends StaticTest1 {

	public static void m1() {
		System.out.println("Inside sub class m1");
	}

	public static void main(String[] args) {
        StaticTest t1 = new StaticTest();
        t1=null;
        t1.m1();
	}
}
