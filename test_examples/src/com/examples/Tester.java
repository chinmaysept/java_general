package com.examples;

import java.io.IOException;

class Airplane {
	public Airplane() throws IOException {
		System.out.println("Airplane. ");
		throw new IOException();
	}
}

class AirJet extends Airplane {
	public AirJet() throws IOException {
		super();
	}	
}

public class Tester {
	public static void main(String[] args) {
		try {
			   new AirJet();
		   } catch(IOException e) {
			   System.out.println("IOException is thrown in Tester. ");
		   }
	}
   
}
