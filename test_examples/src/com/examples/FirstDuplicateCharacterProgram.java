package com.examples;

public class FirstDuplicateCharacterProgram {
	 
    private static char findFirstDuplicateCharacter(String str)
            throws RuntimeException {
 
        checkForInvalidInput(str);
 
        char[] strChars = str.toCharArray();
        int len = strChars.length;
 
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (strChars[i] == strChars[j]) {
                    return strChars[i];
                }
            }
        }
 
        throw new RuntimeException(
                "There is no duplicate character in the string.");
    }
 
    private static void checkForInvalidInput(String str) {
        if (str == null || str.isEmpty()) {
            throw new RuntimeException("Input is invalid.");
        }
 
    }
 
    public static void main(String[] args) {
        String str = "abcba";
        try {
            System.out.println("First duplicate character in a string : "
                    + findFirstDuplicateCharacter(str));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
