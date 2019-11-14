package com.examples;

import java.util.HashMap;
import java.util.Map;

public class CheckMap {
	
	public static void main(String[] args) {
		Employee e1 = new Employee("Chinmaya", 1);
		Employee e2 = new Employee("Chinmaya", 2);
		Employee e3 = new Employee("Chinmaya", 3);
		
		Map<Employee, Integer> mp = new HashMap<>();
		mp.put(e1, 1);
		mp.put(e2, 2);
		mp.put(e3, 3);
		
		System.out.println(e1.equals(e2));
		System.out.println(e2.equals(e3));
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
	}

}
