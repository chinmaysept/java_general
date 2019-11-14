package com.codility.examples;

import java.util.HashMap;
import java.util.Stack;

public class BalanceString {
	
	public static void main(String args[]) {

        System.out.println(balancedParenthensies("{(a,b)}"));
        System.out.println(balancedParenthensies("{(a},b)"));
        System.out.println(balancedParenthensies("{)(a,b}"));
        System.out.println(isValid("{(a,b)}"));
    }

    public static int balancedParenthensies(String s) {
    	
        Stack<Character> stack  = new Stack<Character>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '[' || c == '(' || c == '{' ) {

                stack.push(c);

            }else if(c == ']') {
                if(stack.isEmpty()) return 0;
                if(stack.pop() != '[') return 0;

            }else if(c == ')') {
                if(stack.isEmpty()) return 0;
                if(stack.pop() != '(') return 0;

            }else if(c == '}') {
                if(stack.isEmpty()) return 0;
                if(stack.pop() != '{') return 0;
            }

        }
        return stack.isEmpty() ? 1:0;
    }
    
    //2nd way
    
    public static boolean isValid(String s) {
    	HashMap<Character, Character> map = new HashMap<Character, Character>();
    	map.put('(', ')');
    	map.put('[', ']');
    	map.put('{', '}');
     
    	Stack<Character> stack = new Stack<Character>();
     
    	for (int i = 0; i < s.length(); i++) {
    		char curr = s.charAt(i);
     
    		if (map.keySet().contains(curr)) {
    			stack.push(curr);
    		} else if (map.values().contains(curr)) {
    			if (!stack.empty() && map.get(stack.peek()) == curr) {
    				stack.pop();
    			} else {
    				return false;
    			}
    		}
    	}
     
    	return stack.empty();
    }

}
