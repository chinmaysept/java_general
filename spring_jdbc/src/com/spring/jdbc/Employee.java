package com.spring.jdbc;

public class Employee {  
private int id;  

public void setId(int id) {
	this.id = id;
}

public void setName(String name) {
	this.name = name;
}

public void setSalary(float salary) {
	this.salary = salary;
}
private String name;  
private float salary;  
//no-arg and parameterized constructors  
//getters and setters  
public String toString(){  
    return id+" "+name+" "+salary;  
}  
}  
