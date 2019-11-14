package test;

import java.util.HashMap;
import java.util.Map;

public class PermutationCheck {
	
	public static void main(String[] args) {
		int [] a = new int [] {2, 1, 3, 5, 4, 3, 2};
		int [] b = new int [] {3, 2, 2, 4, 5, 3, 1};
		boolean c = checkPermutation(a, b);
		System.out.println("Permutation is:" +c);
		
	}
	
	public static boolean checkPermutation(int [] a, int [] b) {
		
Map<Integer, Integer> check = new HashMap<>();
		
		for (int i = 0; i < a.length; i++) 
        { 
            int x = a[i]; 
            if (check.get(x) == null) 
            	check.put(x, 1); 
            else
            { 
                int k = check.get(x); 
                check.put(x, k+1); 
            } 
        } 
  
        // Traverse through second array and check if every element is 
        // present in hash map 
        for (int i = 0; i < b.length; i++) 
        { 
            int x = b[i]; 
  
            // If element is not present in hash map or element 
            // is not present less number of times 
            if (check.get(x) == null || check.get(x) == 0) 
                return false; 
  
            int k = check.get(x); 
            check.put(x, k-1); 
        } 
        return true; 
	}

}
