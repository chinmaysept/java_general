package com.examples;

public class TestEnum {
	public enum Level {
	    HIGH  ("abc", "def"),  //calls constructor with value 3
	    MEDIUM("ghi", "jkl"),  //calls constructor with value 2
	    LOW("mno","pqr")   //calls constructor with value 1
	    ; // semicolon needed when fields / methods follow


	    private final String levelCode;
	    private final String code;

	    private Level(String levelCode, String code) {
	        this.levelCode = levelCode;
	        this.code = code;
	    }
	}


}
