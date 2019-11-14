package com.test.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ObjectConversion {
	
	public static void main(String[] args) {
		/*List<Double> doubleList = new ArrayList<>();
		doubleList.add(1.38);
		doubleList.add(2.56);
		doubleList.add(4.3);
		Object [] doubleObj = doubleList.toArray();
		BigDecimal [] b1 = new BigDecimal[doubleObj.length];
		int j = doubleObj.length;
		for(int i=0; i<doubleObj.length; i++) {
			//System.out.println(value + " ");
			Object obj1 = doubleObj[i];
			Double d1 = (Double) obj1;
			double d2 = d1.doubleValue();
				
			BigDecimal d3 = BigDecimal.valueOf(d2);
			System.out.println(d3);
			b1[i]  = d3;
			//j++;
			
		}
		for(BigDecimal val : b1) {
			System.out.print(val+ " ");
		}*/
		
	/*	List<BigDecimal> li = new ArrayList<BigDecimal>();
		List<Double> d1 = new ArrayList<Double>();//  {1.38, 2.56, 4.3};
		d1.add(1.38);
		d1.add(2.56);
		d1.add(4.3);
		for(Double d4 : d1) {
			double d2 = d4.doubleValue();
			BigDecimal d3 = BigDecimal.valueOf(d2);
//			System.out.println(d3);
			li.add(d3);
		}
		for (BigDecimal val: li) {
			System.out.print( val + " ");
		}*/
		
		/*Map<Integer, String> mp = new HashMap<>();
		mp.put(1, "abc");
		mp.put(2, "def");
		mp.put(3, "ghi");
		mp.put(null, "ijk");
		
		for(Map.Entry<Integer, String> keyVal: mp.entrySet()) {
			System.out.println(keyVal.getKey() + " "+ keyVal.getValue());
		}*/
		
		List<String> t1 = new ArrayList<>();
		t1.add("121.0");
		t1.add("24.12");
		t1.add("345.89");
		List<BigDecimal> big  = new ArrayList<>();
		for(String values : t1) {
			double d1 = Double.parseDouble(values);
			BigDecimal b1 = BigDecimal.valueOf(d1);
			big.add(b1);
		}
		
		for(BigDecimal b2 : big) {
			System.out.println(b2.doubleValue());
		}
		
		
		
		
		
		
	}

}
