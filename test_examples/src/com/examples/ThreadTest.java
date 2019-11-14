package com.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThreadTest {//extends Thread implements Runnable{

	public void run() {
		System.out.println("test is it working?");
	}
	
	public static void main(String[] args) {
//		Thread t = new Thread(new ThreadTest());
//		t.start();
		
		//Map<Integer, String> mp = new HashMap<>();
		//mp.
		List<Integer> li = new ArrayList<>();
		li = Collections.unmodifiableList(li);
	}
}
