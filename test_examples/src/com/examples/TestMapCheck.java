package com.examples;

import java.util.HashMap;
import java.util.Map;

class TestMap {
	int id;
	int age;
	
	public TestMap() {
		this.id = 10;
		this.age = 20;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TestMap other = (TestMap) obj;
		if (age != other.age)
			return false;
		if (id != other.id)
			return false;
		return true;
	}
}

public class TestMapCheck {
	
	public static void main(String[] args) {
		TestMap tmp = new TestMap();
		Map mp = new HashMap();
		mp.put(tmp, "abc");
		m2(tmp);
		m3(mp, tmp);
		System.out.println("The value in HashMap..."+mp.get(tmp));
	}
	
	public static  void m2(TestMap t) {
		t.setAge(30);
		t.setId(20);
	}
	
	public static void m3(Map mp, TestMap mp1) {
		
		mp.get(mp1);
	}

}
