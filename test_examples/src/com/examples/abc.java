package com.examples;

import java.lang.reflect.Method;

public class abc {

	public static void main(String[] args) throws ClassNotFoundException {
		/*int i = 100, j=200;
		while(++i < --j){
			System.out.println(i);
		}*/
		/*long l = 12345676666L;
		System.out.println(l);*/
		
		/*byte i = 37, j = 18;
		int k = i%j;
		System.out.println(k);*/
		Class cls = Class.forName("java.lang.String");
		Method [] m = cls.getDeclaredMethods();
		for(Method m1 : m )
		System.out.println(m1);
		
	}
}
