package com.niit.tech;

class Test4 {
 private Demo d;
 void start() {
 d = new Demo();
 this.takeDemo(d);
 }

 void takeDemo(Demo demo) {
 demo = null;
 demo = new Demo();
 }
 }
