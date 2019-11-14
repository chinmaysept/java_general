package com.thread.example;

import java.util.LinkedList;
import java.util.Queue;

public class TestThreadPoolManager {
  
	public static void main(String[] args) {
        ThreadPoolManager poolManager = new ThreadPoolManager(10);
         
        //now lets submit task
        poolManager.submitTask(new Runnable() {
            @Override
            public void run() {
                System.out.println("Starting Task A....");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Task A Completed....");
            }
        });
         
        poolManager.submitTask(new Runnable() {
            @Override
            public void run() {
                System.out.println("Starting Task B....");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Task B Completed....");
            }
        });
    }
	
}

class ThreadPoolManager {
	 
    private final int THREADPOOL_CAPACITY;
    private MyQueue<Runnable> myQueue = new MyQueue<Runnable>();
     
    public ThreadPoolManager(int capacity){
        this.THREADPOOL_CAPACITY = capacity;
        initAllConsumers();
    }
     
    private void initAllConsumers(){
        for(Integer i = 0; i < THREADPOOL_CAPACITY; i++){
            Thread thread = new Thread(new Worker(myQueue, i.toString()));
            thread.start();
        }
    }
     
     
    public void submitTask(Runnable r){
        myQueue.enqueue(r);
    }
     
}
 
 
class MyQueue<E> implements CustomQueue<E>{
 
    // queue backed by a linkedlist
    private Queue<E> queue = new LinkedList<E>();
     
     
    /**
     * Enqueue will add an object to this queue, and will notify any waiting
     * threads that now there is an object available.
     * 
     * In enqueue method we just adding the elements not caring of size,
     * we can even introduce some check of size here also.
     */
    @Override
    public synchronized void enqueue(E e) {
        queue.add(e);
        // Wake up anyone waiting on the queue to put some item.
        notifyAll();
    }
 
    /**
    * Make a blocking call so that we will only return when the queue has
    * something on it, otherwise wait until something is put on it.
    */
    @Override
    public synchronized E dequeue(){
        E e = null;
         
        while(queue.isEmpty()){
            try {
                wait();
            } catch (InterruptedException e1) {
                return e;
            }
        }
        e = queue.remove();
        return e;
    }
}

class Worker implements Runnable{
	 
    private MyQueue<Runnable> myQueue;
    private String name;
     
    public Worker(MyQueue<Runnable> myQueue, String name){
        this.myQueue = myQueue;
        this.name = name;
    }
     
     
    @Override
    public void run() {
        while(true){
            Runnable r = myQueue.dequeue();
            // print the dequeued item
            System.out.println(" Taken Item by thread name:" + this.name );
            // run it
            r.run();
            System.out.println(" Task completed of thread:" + this.name);
        }
    }
}

interface CustomQueue<E>{
	 
    public void enqueue(E e);
     
    public E dequeue();
     
}
