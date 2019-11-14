package com.custom.annotation;

//Creating annotation  
import java.lang.annotation.*;  
import java.lang.reflect.*;  

@Retention(RetentionPolicy.RUNTIME)  
@Target(ElementType.METHOD)  
@interface MyAnnotation{  
int value();  
}  