package com.examples;

import java.util.ArrayList;

public class TestForList {
	public String name;
   
	public TestForList (String name) {
		this.name = name;
	}
	
	public static void main (String [] args) {
		ArrayList li = new ArrayList();
		TestForList alt = new TestForList("Rasmita");
		System.out.println("Hashcode before ..."+alt.hashCode());
		li.add(alt);
		alt.setName("Chinmaya");
		TestForList ti = (TestForList)li.get(0);
		System.out.println("hashcode after..."+ti.hashCode());
		//System.out.println("The value:"+ti.getName());
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
