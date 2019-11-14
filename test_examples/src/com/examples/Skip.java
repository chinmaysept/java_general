package com.examples;

import java.util.Arrays;

public class Skip {
	static int x;
 public static void main(String[] args) throws Exception {
// Thread t1 = new Thread(new Jump());
// Thread t2 = new Thread(new Jump());
// t1.start(); t2.start();
// t1.join(500);
// new Jump().run();
	 
//	 String s = "dogs. with words.";
//	  // insert code here
//	 String[] output = s.split("s");
//	  for(String o: output)
//	  System.out.print(o + " ");
 } 
public void setVal(final String str) {
	
}

static {
	x = 7;
	System.out.println("The value of x:"+x);
}
}
 class Jump implements Runnable {
 public void run() {
 for(int i = 0; i < 5; i++) {
 try { Thread.sleep(200); }
 catch (Exception e) { System.out.print("e "); }
 System.out.print(Thread.currentThread().getId() + "-" + i + " ");
 
 //Arrays.linearSearch();
 } } }
