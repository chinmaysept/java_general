package com.test;

/* Save this in a file called Main.java to compile and test it */

/* Do not add a package declaration */
import java.util.*;
import java.util.Map.Entry;
import java.io.*;
import java.util.*;

/* DO NOT CHANGE ANYTHING ABOVE THIS LINE */
/* You may add any imports here, if you wish, but only from the 
   standard library */

/* Do not add a namespace declaration */
public class Main {
    public static Map<String,Integer> processData(ArrayList<String> array) {
        /* 
         * Modify this method to process `array` as indicated
         * in the question. At the end, return the appropriate value.
         *
         * Please create appropriate classes, and use appropriate
         * data structures as necessary.
         *
         * Do not print anything in this method.
         *
         * Submit this entire program (not just this method)
         * as your answer
         */
        Map<String,Integer> retVal = new HashMap<String,Integer>();
        Map<String,String> subjectMap = new HashMap<>();
        List<MarksDetail> marksArray = new ArrayList<MarksDetail>();
        for(int i=0; i<array.size(); i++) {
        	String[] tempArr = (array.get(i)).split("\\|");
        	MarksDetail markDet = new MarksDetail();
        	markDet.setSubjectId(Integer.parseInt(tempArr[0]));
        	markDet.setSubject(tempArr[1]);
        	markDet.setMarks(Integer.parseInt(tempArr[2]));
        	//System.out.println();
        	marksArray.add(markDet);
        	subjectMap.put(tempArr[0], tempArr[1]);
        }
       getMaxForEachSubject(marksArray,retVal,subjectMap);
       return retVal;
    }
   
   public static void getMaxForEachSubject(List<MarksDetail>marksArray , Map<String, Integer> retVal,Map<String,String> subjectMap){
	   Collections.sort(marksArray, new marksComparator());
       Iterator<Entry<String, String>>it = subjectMap.entrySet().iterator();
       while(it.hasNext()){
    	   Entry<String, String> entry = (Entry<String, String>)it.next();
    	   String subjectId = entry.getKey();
    	   String subject = entry.getValue();
       	System.out.println(subjectId +"::::#######::"+subject);
       
       	for(int i= 0; i<marksArray.size();i++){
       		MarksDetail m = marksArray.get(i);
       		System.out.println(subjectId  +" inside::::::"+m.getSubject());
       		if(subject == m.getSubject()){
       			System.out.println(m.getSubject()+" ::: "+ Collections.max(marksArray).getSubjectId() );
       			retVal.put(subject,Collections.max(marksArray).getSubjectId());
       		}
       	}
       }    
   }
    
    public static void main (String[] args) {
        ArrayList<String> inputData = new ArrayList<String>();
        String line = null;
        Scanner in = null;
        PrintWriter output = null;
        try {
        	in = new Scanner(new BufferedReader(new FileReader("D://input.txt")));
            while(in.hasNextLine())
                inputData.add(in.nextLine());
            Map<String,Integer> retVal = processData(inputData);
             output = new PrintWriter(new BufferedWriter(new FileWriter(new File("D://output.txt"))));
            for(Map.Entry<String,Integer> e: retVal.entrySet())
                output.println(e.getKey() + ": " + e.getValue());
        } catch (IOException e) {
            System.out.println("IO error in input.txt or output.txt");
            e.printStackTrace();
        } finally{
        	if(in != null)
        	in.close();
        	if(output != null)
        	 output.close();
        }
    }
}
