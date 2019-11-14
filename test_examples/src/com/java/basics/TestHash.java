package com.java.basics;

import java.util.HashMap;
import java.util.Map;

public class TestHash {
	
	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		Employee e4 = new Employee();
		Map<Employee, String> mp = new HashMap<>();
		mp.put(e1, "abc");
		mp.put(e2, "def");
		mp.put(e3, "ghi");
		mp.put(e4, "jkl");
		System.out.println(mp.size());
	}

}
