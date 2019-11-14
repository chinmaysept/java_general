package com.test;

public class TestClass
{
   public static void main(String[] args)  {     calculate(2);    }
   public static void calculate(int x)
   {
      String val;
      switch(x)
      {
         case 2:
         default:
         val = "def";
      }
      System.out.println(val);
   }
}
