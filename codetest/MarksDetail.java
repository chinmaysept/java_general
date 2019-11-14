package com.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MarksDetail implements Comparable<MarksDetail>{
	
Integer subjectId;
public Integer getSubjectId() {
	return subjectId;
}
public void setSubjectId(Integer subjectId) {
	this.subjectId = subjectId;
}

String subject;
Integer marks;

//getters and Setters
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public Integer getMarks() {
	return marks;
}
public void setMarks(Integer marks) {
	this.marks = marks;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((marks == null) ? 0 : marks.hashCode());
	result = prime * result + ((subject == null) ? 0 : subject.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	MarksDetail other = (MarksDetail) obj;
	if (marks == null) {
		if (other.marks != null)
			return false;
	} else if (!marks.equals(other.marks))
		return false;
	if (subject == null) {
		if (other.subject != null)
			return false;
	} else if (!subject.equals(other.subject))
		return false;
	return true;
}

 @SuppressWarnings("unchecked")
public static void main(String[] args) {
	 List<MarksDetail> marksarray = new ArrayList<MarksDetail>();
	MarksDetail markDet = new MarksDetail();
 	markDet.setSubject("Maths");
 	markDet.setMarks(10);
 	MarksDetail markDet1 = new MarksDetail();
 	markDet1.setSubject("Maths");
 	markDet1.setMarks(90);
 	MarksDetail markDet2 = new MarksDetail();
 	markDet2.setSubject("Maths");
 	markDet2.setMarks(50);
 	
 	marksarray.add(markDet);
	marksarray.add(markDet1);	
	marksarray.add(markDet2);
	
Collections.sort(marksarray, new marksComparator());
System.out.println(Collections.max(marksarray).getMarks());
 }

@Override
public int compareTo(MarksDetail o) {
	// TODO Auto-generated method stub
	if (this.getMarks() > o.getMarks())
		return 1;
	else if (this.getMarks()< o.getMarks())
		return -1;
	else
		return 0;
}
}
class marksComparator implements Comparator<MarksDetail> {

	@Override
	public int compare(MarksDetail arg0, MarksDetail arg1) {
		// TODO Auto-generated method stub
		int marks1 = arg0.getMarks();
		int marks2 = arg1.getMarks();
		if (marks1 > marks2) {
			return 1;
		} else if (marks1 < marks2) {
			return -1;
		} else {
			return 0;
		}
	}
 
	}

