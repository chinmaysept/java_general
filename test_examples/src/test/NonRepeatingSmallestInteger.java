package test;

import java.util.HashSet;

public class NonRepeatingSmallestInteger {
	
	 public int solution(int[] a) {

	        HashSet<Integer> hashSet = new HashSet<Integer>();
	        int smallInt = 1;

	        for (int i = 0 ; i < a.length; i++) {
	            hashSet.add(a[i]);                     
	        }

	         while (hashSet.contains(smallInt)) {
	             smallInt++;
	            }

	        return smallInt;
	    }
	 
	 public static void main(String[] args) {
		 NonRepeatingSmallestInteger nrs = new NonRepeatingSmallestInteger();
		 int [] a = new int [] {1, 2,3};
		 System.out.println(nrs.solution(a));
	}

}
