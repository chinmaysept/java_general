package com.examples;

import java.io.FileNotFoundException;



public class Test4 {//implements Callable<Integer>, Runnable {// {
	public Test4() {
		System.out.println("Test4");
	}
	
	public void get(long a) {
		System.out.println("Long");
	}
	
	public void get(double a) {
		System.out.println("Long");
	}
	
	public void print() throws FileNotFoundException {
		System.out.println("Super");
	}

	public static void main(String[] args) {
		
	
	Test4 t = new Test4();
	t.get(10);
 }
}

