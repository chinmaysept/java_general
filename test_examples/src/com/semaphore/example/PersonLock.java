package com.semaphore.example;

import java.util.concurrent.Semaphore;

public class PersonLock {

 

 /**
12
  * We do not want multiple lock objects lying around so we make ths class
13
  * singleton
14
  */

 private PersonLock() {

 

 }

 

 /**
20
  * Bill Pugh's way of lazy initializing the singleton instance
21
  *
22
  * @author dinuka.arseculeratne
23
  *
24
  */

 private static class SingletonHolder {

  public static final PersonLock INSTANCE = new PersonLock();

 }

 

 /**
30
  * Use this method to get a reference to the singleton instance of
31
  * {@link PersonLock}
32
  *
33
  * @return the singleton instance
34
  */

 public static PersonLock getInstance() {

  return SingletonHolder.INSTANCE;

 }


 /**
40
  * In this sample, we allow only one thread at at time to update the cache
41
  * in order to maintain consistency
42
  */

 private Semaphore writeLock = new Semaphore(1);

 /**
46
  * We allow 10 concurrent threads to access the cache at any given time
47
  */

 private Semaphore readLock = new Semaphore(10);

 

 public void getWriteLock() throws InterruptedException {

  writeLock.acquire();

 }

 

 public void releaseWriteLock() {

  writeLock.release();

 }

 

 public void getReadLock() throws InterruptedException {

  readLock.acquire();

 }

 

 public void releaseReadLock() {

  readLock.release();

 }

}
