package com.examples;

import org.bouncycastle.jce.provider.symmetric.Grain128.Base;

public class CastingExample {
  public static void main(String[] args) {
	BaseClass subBase = new SubClass();
	BaseClass base = new BaseClass();
	SubClass sub = new SubClass();
	subBase.display();
	//SubClass sub = (SubClass)base;
	//sub.display();
	BaseClass baseC = (BaseClass)sub;
	baseC.display();
}
}

class BaseClass {
	public void display() {
		System.out.println("base Class display");
	}
}

class SubClass extends BaseClass {
	public void display() {
		System.out.println("Sub Class display");
	}
}
