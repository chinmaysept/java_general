package com.examples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class DuplicateRemovalFromArrayList {

	public static void main(String[] args) {
		ArrayList<String> li = new ArrayList<String>();
		li.add("abc");
		li.add("abc");
		li.add("abc");
		li.add("def");
		li.add("def");
		li.add("seq");
		li.add("seq");
		li.add("seq");
		li.add("seq");
		removeDuplicate(li);

	}

	public static void removeDuplicate(ArrayList<String> al) {
		HashSet<String> se = new HashSet<String>();
		se.addAll(al);
		Iterator<String> it = se.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
