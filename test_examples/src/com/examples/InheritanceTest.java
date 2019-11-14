package com.examples;

class Horse {
	static String s = "";
	 void beBrisk() { s += "trot "; }
}
public class InheritanceTest extends Horse {
	void beBrisk() { s += "tolt "; }
	
	public static void main(String[] args) {
		
		 Horse x0 = new Horse();
		 Horse x1 = new InheritanceTest(); x1.beBrisk();
		 InheritanceTest x2 = (InheritanceTest)x1; x2.beBrisk();
		 //InheritanceTest x3 = (InheritanceTest)x0; x3.beBrisk();
		 System.out.println(s);
		
	}
}
