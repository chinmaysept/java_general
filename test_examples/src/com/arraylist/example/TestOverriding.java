package com.arraylist.example;

public class TestOverriding extends TestMethodOverload {
	
//	static int a = 12;
//	static int b = 4;
	static int i = 1;
	public static void call() throws RuntimeException {
//		System.out.println("a"+a);
		System.out.println(i++ + i++ + ++i + ++i );
		return;
	}
	
	public static void main(String[] args) {
		//call();
		//System.out.println("b"+TestOverriding.b);
		System.out.println(getFirstNonRepeatingChar("abcabd"));
		
	}
	
	public static Character getFirstNonRepeatingChar(String t){
        
        for (int i = 0; i < t.length(); i++) {
            if (t.lastIndexOf(t.charAt(i)) == i) {
                return t.charAt(i);
            }
        }
    
        return null;
}
	
	/*public void m1(int i) {
		System.out.println("inside subclass");
	}
	
	public static void main(String[] args) {
		TestMethodOverload t = new TestOverriding();
		t.m1(3);
	}*/

}
