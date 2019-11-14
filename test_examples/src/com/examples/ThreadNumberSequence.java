package com.examples;


import java.util.concurrent.atomic.AtomicInteger;

public class ThreadNumberSequence {

private AtomicInteger sharedOutput = new AtomicInteger(0);
private Object object = new Object();

public static void main(String args[]) {

	ThreadNumberSequence t = new ThreadNumberSequence();

    ThreadTasks t1 = t.new ThreadTasks(0);
    ThreadTasks t2 = t.new ThreadTasks(1);
    ThreadTasks t3 = t.new ThreadTasks(2);

    Thread ts1 = new Thread(t1);
    Thread ts2 = new Thread(t2);
    Thread ts3 = new Thread(t3);

    ts1.start();
    ts2.start();
    ts3.start();

}

private class ThreadTasks implements Runnable {

    private final int threadPosition;

    public ThreadTasks(int threadPosition) {
        super();

        this.threadPosition = threadPosition;
    }

    @Override
    public void run() {

        while (sharedOutput.get() < 10) {

            synchronized (object) {

                if (sharedOutput.get() % 3 == this.threadPosition) {

                    if(sharedOutput.get() < 10)
                    System.out.println("Printing output for Thread: "
                            + this.threadPosition + "  "
                            + sharedOutput.incrementAndGet());
                }
            }
        }

    }
}

}
