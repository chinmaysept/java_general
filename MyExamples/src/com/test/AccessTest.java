package com.test;

public class AccessTest
{
   String a = "x";
   static char b = 'x';
   String  c = "x";
   class Inner
   {
      String  a = "y";
      String  get()
      {
         String c = "temp";
         // Line 1
//         c = ""+AccessTest.b;
//         c = AccessTest.this.a;
         c = ""+b;
         return c;
      }
   }
   AccessTest() { System.out.println(  new Inner().get()  ); }
   public static void main(String args[]) { 
	   
	   //new AccessTest();  
	   int ia[][] = { {1, 2}, null };
	      for (int i = 0; i < 2; i++)
	         for (int j = 0; j < 2; j++)
	            System.out.println(ia[i][j]);
	   
   }
}
