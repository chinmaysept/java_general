package com.examples;

import java.text.NumberFormat;

public class WeatherTest {
	static Weather w;

	public static void main(String[] args) throws Exception {
		//System.out.print(w.RAINY.count + " " + w.Sunny.count + " ");
		
		String s = "123.456xyz";
		NumberFormat nf = NumberFormat.getInstance();
		System.out.println(nf.parse(s));
		nf.setMaximumFractionDigits(2);
		System.out.println(nf.format(s));
	}
}
enum Weather {
	RAINY, Sunny;
	int count = 0;
	Weather() {
		System.out.print("c ");
		count++;
	}
  }

