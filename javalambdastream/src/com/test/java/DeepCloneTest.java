package com.test.java;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;


public class DeepCloneTest { 
	private static final Logger log = Logger.getLogger(DeepCloneTest.class);

public static void main(String args[]) {
	Programmer javaguru = new Programmer("John", 31);
	javaguru.addCertificates("OCPJP");
	javaguru.addCertificates("OCMJD");
	javaguru.addCertificates("PMP");
	javaguru.addCertificates("CISM");
	log.debug(javaguru); 
	Programmer clone = javaguru.clone();
	log.debug(clone);
	//let's add another certification to java guru 
	javaguru.addCertificates("Oracle DBA");
	log.debug(javaguru);
	log.debug(clone);
	
  }
} 

class Programmer implements Cloneable{ 
	
	private static final Logger logger = Logger.getLogger(Programmer.class);
	private String name; 
	private int age;
	private List certifications ;
	public Programmer(String name, int age) {
		this.name = name; 
		this.age = age;
		this.certifications = new ArrayList();
	} 
	public int getAge() {
		return age; 
	} 
	public void setAge(int age) { 
		this.age = age;
	} 
	public String getName() {
		return name;
	} 
	public void setName(String name) {
		this.name = name; 
	} 
	public void addCertificates(String certs){ 
		certifications.add(certs);
	} 
	
	@Override public String toString() {
		return String.format("%s, %d, Certifications: %s", name, age, certifications.toString());
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override 
	protected Programmer clone() { 
		Programmer clone = null;
		try{ 
		clone = (Programmer) super.clone();
		clone.certifications = new ArrayList(certifications);
		//deep copying
		} catch(CloneNotSupportedException cns){
			logger.error("Error while cloning programmer", cns); 
		  } 
		return clone; 
	}
} 




