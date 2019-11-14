package com.custom.annotation;

import java.lang.reflect.Method;

//Accessing annotation  
class TestCustomAnnotation{  
public static void main(String args[])throws Exception{  

Hello h=new Hello();  
Method m=h.getClass().getMethod("sayHello");  

MyAnnotation manno=m.getAnnotation(MyAnnotation.class);  
System.out.println("value is: "+manno.value());  
}}  
