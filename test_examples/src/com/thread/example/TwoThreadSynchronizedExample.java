package com.thread.example;

public class TwoThreadSynchronizedExample {//implements Runnable {

	public synchronized void m1() {
		//try{
			System.out.println("Test1");
			//wait();
		//}catch(InterruptedException e) {
			
		//}
	}
	
	/*public static synchronized void m2() {
		//try{
			System.out.println("Test2");
			//wait();
		//}catch(InterruptedException e) {
			
		//}
	}*/
	
	public synchronized  void m2() {
		//try{
			System.out.println("Test2");
			//wait();
		//}catch(InterruptedException e) {
			
		//}
	}
	
	public   void m3() {
		//try{
		synchronized(this){
			System.out.println("Test3");
		}
			//wait();
		//}catch(InterruptedException e) {
			
		//}
	}
	
	public  static synchronized void m4() {
		//try{
		
			System.out.println("Test4");
		
			//wait();
		//}catch(InterruptedException e) {
			
		//}
	}
	
	public  static synchronized void m5() {
		//try{
		synchronized(TwoThreadSynchronizedExample.class){
			System.out.println("Test5");
		}
			//wait();
		//}catch(InterruptedException e) {
			
		//}
	}
	
	public   void m6() {
		//try{
		synchronized(this){
			System.out.println("Test6");
		}
			//wait();
		//}catch(InterruptedException e) {
			
		//}
	}

	/*@Override
	public void run() {
      System.out.println("Start the thread");		
	}*/
	
	public static void main(String[] args) {
		TwoThreadSynchronizedExample t = new TwoThreadSynchronizedExample();
		
		Thread t1 = new Thread() { public void run() { t.m1(); } };
		//t1.setName("First Thread...");
        Thread t2 = new Thread() { public void run() { t.m2(); } };
        Thread t3 = new Thread() { public void run() { t.m3(); } };
        Thread t6 = new Thread() { public void run() { t.m6(); } };
        Thread t4 = new Thread() { public void run() { t.m4(); } };
        Thread t5 = new Thread() { public void run() { t.m5(); } };
        
        //t2.setName("Second Thread...");

        t1.start();
        try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

        t2.start();
        try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
        t3.start();
        try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
        t4.start();
        try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
        t5.start();
        try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
        t6.start();
        try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

        System.out.println(t1.getState());
        System.out.println(t2.getState());
        System.out.println(t3.getState());
        System.out.println(t4.getState());
        System.out.println(t5.getState());
        System.out.println(t6.getState());
	}
}
