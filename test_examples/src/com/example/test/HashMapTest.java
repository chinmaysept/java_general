package com.example.test;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
	
	public static void main(String[] args) {
		Map<Integer, String> mp = new HashMap<>();
		mp.put(1, "abc");
		mp.put(2, "def");
		mp.put(3, "ghi");
		mp.put(4, "jkl");
		mp.put(5, "mno");
		
		System.out.println(mp.get(3));
	}

}
