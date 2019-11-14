package com.codility.examples;

import java.util.HashMap;
import java.util.Map;

public class UnpairedArray {

	public static void main( String[] args ) {
	    int[] a = { 9, 3,9,3, 9, 7, 21,14, 42 };

	    Map<String, Integer> counts = new HashMap<String,Integer>();

	    String key;
	    for ( int i : a ) {
	        key = String.valueOf( i );
	        if ( counts.containsKey( key ) ) {
	            int count = counts.get( key );
	            counts.put( key, ++count );
	        }
	        else {
	            counts.put( key, 1 );
	        }
	    }

	    for ( Map.Entry<String, Integer> entry : counts.entrySet() ) {
	        if ( entry.getValue() < 2 ) {
	            System.out.println( entry.getKey() + " does not have a pair" );
	        }
	    }
	}
	
}
