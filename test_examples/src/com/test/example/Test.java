/**
 * 
 */
package com.test.example;

/**
 * @author cmishra
 *
 */

class TestStatic {
	public static void m4(){
		System.out.println("I am inside superclass");
	}
}
public class Test extends TestStatic {
	
	public int value;
	Test3 t = new Test3();
	Integer n ;
//	int m = 0;
	int m;
	
	public Test() {
//	Test3 t = new Test3();
//	t.print();
//		m = n;
		
	}
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public void m1() {
		int a = 10;
		Test t1 = new Test();
		t1.m2(a, t1);
		System.out.println(a);
		System.out.println(t1.getValue());
	}
	
	public void m2(int b, Test t) {
		 b = 20;
		t.setValue(2000);
		Test t2 = new Test();
		t2.setValue(5000);
	}
	
	public static void m4(){
		System.out.println("I am inside subclass");
	}

	public static void main(String[] args) {
		/*Test t3 = new Test();
		t3.m1();*/
//		Test t1 = new Test();
//		System.out.println(t1.m);
		
		TestStatic ts = new Test();
		ts.m4();
		
		
	}

}
