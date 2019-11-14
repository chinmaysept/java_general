package com.examples;

/* Save this in a file called Main.java to compile and test it */

/* Do not add a package declaration */
import java.util.*;
import java.util.Map.Entry;
import java.io.*;


/* DO NOT CHANGE ANYTHING ABOVE THIS LINE */
/* You may add any imports here, if you wish, but only from the 
 standard library */

/* Do not add a namespace declaration */
public class Main {
	public static Map<String, Integer> processData(ArrayList<String> array) {
		/*
		 * Modify this method to process `array` as indicated in the question.
		 * At the end, return the appropriate value.
		 * 
		 * Please create appropriate classes, and use appropriate data
		 * structures as necessary.
		 * 
		 * Do not print anything in this method.
		 * 
		 * Submit this entire program (not just this method) as your answer
		 */
		Map<String, Integer> retVal = new HashMap<String, Integer>();
		Map<String, String> subjectMap = new HashMap<>();
		List<MarksDetail> marksArray = new ArrayList<MarksDetail>();
		for (int i = 0; i < array.size(); i++) {
			String[] tempArr = (array.get(i)).split("\\|");
			MarksDetail markDet = new MarksDetail();
			markDet.setSubjectId(Integer.parseInt(tempArr[0]));
			markDet.setSubject(tempArr[1]);
			markDet.setMarks(Integer.parseInt(tempArr[2]));
			marksArray.add(markDet);
			subjectMap.put(tempArr[0], tempArr[1]);
		}
		getMaxForEachSubject(marksArray, retVal, subjectMap);
		return retVal;
	}

	public static void getMaxForEachSubject(List<MarksDetail> marksArray,
			Map<String, Integer> retVal, Map<String, String> subjectMap) {
		Collections.sort(marksArray, new marksComparator());
		Collections.sort(marksArray, new SubjectIDComparator());
		Iterator<Entry<String, String>> it = subjectMap.entrySet().iterator();
		while (it.hasNext()) {
			Entry<String, String> entry = (Entry<String, String>) it.next();
//			String subjectId = entry.getKey();
			String subject = entry.getValue();

			for (int i = 0; i < marksArray.size(); i++) {
				MarksDetail m = marksArray.get(i);
				if (subject == m.getSubject()) {
					retVal.put(subject, Collections.min(marksArray)
							.getSubjectId());

				}
			}
		}
	}

	public static void main(String[] args) {
		ArrayList<String> inputData = new ArrayList<String>();
		//String line not required
		String line = null;
		Scanner in = null;
		PrintWriter output = null;
		try {
			in = new Scanner(new BufferedReader(new FileReader("input.txt")));
			while (in.hasNextLine())
				inputData.add(in.nextLine());
			Map<String, Integer> retVal = processData(inputData);
			output = new PrintWriter(new BufferedWriter(new FileWriter(
					new File("output.txt"))));
			for (Map.Entry<String, Integer> e : retVal.entrySet())
				output.println(e.getKey() + ": " + e.getValue());
		} catch (IOException e) {
			System.out.println("IO error in input.txt or output.txt");
			e.printStackTrace();
		} finally {
			if (in != null)
				in.close();
			if (output != null)
				output.close();
		}
	}
}

class MarksDetail implements Comparable<MarksDetail> {

	Integer subjectId;
	String subject;
	Integer marks;

	// getters and Setters
	public Integer getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Integer subjectId) {
		this.subjectId = subjectId;
	}

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
	public int compareTo(MarksDetail o) {
		// TODO Auto-generated method stub
		if (this.getMarks() > o.getMarks())
			return 1;
		else if (this.getMarks() < o.getMarks())
			return -1;
		else
			return 0;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((marks == null) ? 0 : marks.hashCode());
		result = prime * result + ((subject == null) ? 0 : subject.hashCode());
		result = prime * result
				+ ((subjectId == null) ? 0 : subjectId.hashCode());
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
		if (subjectId == null) {
			if (other.subjectId != null)
				return false;
		} else if (!subjectId.equals(other.subjectId))
			return false;
		return true;
	}
}

class marksComparator implements Comparator<MarksDetail> {

	@Override
	public int compare(MarksDetail arg0, MarksDetail arg1) {
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

class SubjectIDComparator implements Comparator<MarksDetail> {

	@Override
	public int compare(MarksDetail arg0, MarksDetail arg1) {
		int subid1 = arg0.getSubjectId();
		int subid2 = arg1.getSubjectId();

		if (subid1 > subid2) {
			return 1;
		} else if (subid1 < subid2) {
			return -1;
		} else {
			return 0;
		}
	}

}
