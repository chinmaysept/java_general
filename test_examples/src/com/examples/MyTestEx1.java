package com.examples;

class MyTestEx2 {
 public MyTestEx2() {
	 System.out.println("0");
 }
}

class MyTestEx3 extends MyTestEx2 {
	public MyTestEx3() {
		 System.out.println("1");
	 }
}



public class MyTestEx1 extends MyTestEx3 {
	 public MyTestEx1() {
		 System.out.println("2");
	 }

	public static void main(String[] args) {
		MyTestEx2 a = new MyTestEx1();
		MyTestEx3 b = (MyTestEx3)a;
	}
}
