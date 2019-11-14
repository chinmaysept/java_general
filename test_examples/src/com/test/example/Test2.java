package com.test.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test2 extends Test {
	
	public Test2() {
		//super();
		value = 10;
		
	}

	public static void main (String... args) {
		//t.print();
		List<String> l = new ArrayList();
		l.add("A");
		l.add("B12");
		l.add("C");
		l.set(1, "B");
		l.add("D");
		
		/*for(String s : l) {
			System.out.println(s);
		}*/
		
		l.remove("A");
		
		/*Iterator<String> it = l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}*/
		//for(String s: l) {
			System.out.println(l.get(0));
		//}
	}
}
