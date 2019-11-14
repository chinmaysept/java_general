package com.thread.example;

public class ThreadJoin {
	
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread();
		Thread t2 = new Thread();
		t1.start();
		t1.join();
		t2.start();
	}

}
