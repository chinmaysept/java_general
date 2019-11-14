package com.example.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionTest {
	
	public static void main(String[] args) {
		Test1 t = new Test1();
		Test1 t1 = new Test1();
		List li = new ArrayList();
		li.add(t);
		li.add(t1);
		Collections.sort(li);
		for(int i = 0; i<li.size(); i++) {
			System.out.println((Test1)li.get(i));
		}
	}

}
