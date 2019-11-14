package com.examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ReTest {
	
	public List<String> getValue() {
		List li2 = new ArrayList();
		li2.add("abc");
		return li2;
	}
  public static void main(String[] args) {
	  List<String> li = new ArrayList<String> ();
	  li.add("abc");
	  li.add("def");
	  Iterator it = li.iterator();
	  //System.out.println(li.size());
	  it.remove();
	  //System.out.println(li.size());
}
}
