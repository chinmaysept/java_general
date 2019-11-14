package com.examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DuplicateRepeatation {

	public static void main(String[] args) {
		ArrayList <String> li = new ArrayList <String> ();		
		li.add("abc");
		li.add("abc");
		li.add("abc");
		li.add("c");
		li.add("def");
		li.add("def");
		li.add("c");

		getRepeatation(li);


	}

	public static void getRepeatation(ArrayList <String> li) {
		Map <String, Integer> dupOccurences = new HashMap <String, Integer> ();
		for(int i=0; i<li.size(); i++) {
			String str = li.get(i);
			dupOccurences.put(str,dupOccurences.get(str)==null?1:dupOccurences.get(str)+1);
		}
		System.out.println(dupOccurences);
	}

}
