package com.examples;

public class OddEvenSequenceUsingThreads extends Thread {
volatile static int i = 1;
Object lock;

OddEvenSequenceUsingThreads(Object lock) {
    this.lock = lock;
}

public static void main(String ar[]) {
    Object obj = new Object();
    // This constructor is required for the identification of wait/notify
    // communication
    OddEvenSequenceUsingThreads odd = new OddEvenSequenceUsingThreads(obj);
    OddEvenSequenceUsingThreads even = new OddEvenSequenceUsingThreads(obj);
    odd.setName("Odd");
    even.setName("Even");
    odd.start();
    even.start();
}

@Override
public void run() {
    while (i <= 100) {
        if (i % 2 == 0 && Thread.currentThread().getName().equals("Even")) {
            synchronized (lock) {
                System.out.println(Thread.currentThread().getName() + " - "
                        + i);
                i++;
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        if (i % 2 == 1 && Thread.currentThread().getName().equals("Odd")) {
            synchronized (lock) {
                System.out.println(Thread.currentThread().getName() + " - "
                        + i);
                i++;
                lock.notify();
              }
           }
        }
    }
}
