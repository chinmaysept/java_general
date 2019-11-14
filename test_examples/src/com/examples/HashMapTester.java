package com.examples;

import java.util.HashMap;
import java.util.Map;

public class HashMapTester
{
    private Map<Character, Integer> phoneHash;
    
    // for converting alphabetical characters to numbers based on the 
    // phone dialing pad.
    public HashMapTester()
    {
        phoneHash = new HashMap<Character, Integer>();
        for (char myChar = 'a'; myChar <= 'o'; myChar++)
        {
            // enter all letters from 'a' to 'o' into map
            int number = (int)(2 + (myChar - 'a') / 3);
            phoneHash.put(myChar, number);
            phoneHash.put(Character.toUpperCase(myChar), number);
        }
        for (char myChar = 'p'; myChar <= 's'; myChar++)
        {
            phoneHash.put(myChar, 7);
            phoneHash.put(Character.toUpperCase(myChar), 7);
        }
        for (char myChar = 't'; myChar <= 'v'; myChar++)
        {
            phoneHash.put(myChar, 8);
            phoneHash.put(Character.toUpperCase(myChar), 8);
        }
        for (char myChar = 'w'; myChar <= 'z'; myChar++)
        {
            phoneHash.put(myChar, 9);
            phoneHash.put(Character.toUpperCase(myChar), 9);
        }
    }
    
    // convert string to a long number based on results of 
    // the string's characters run through the hashmap
    public long convertStr(String s) throws IndexOutOfBoundsException
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++)
        {
            char myChar = s.charAt(i);
            if ((myChar >= 'a' && myChar <= 'z') || (myChar >= 'A' && myChar <= 'Z'))
            {
                sb.append(phoneHash.get(myChar));    
            }
            else
            {
                throw new IndexOutOfBoundsException();
            }
        }
        return Long.valueOf(sb.toString());
    }
    
    public static void main(String[] args)
    {
        HashMapTester hmt = new HashMapTester();
        System.out.println(hmt.convertStr("Eight"));
        System.out.println(hmt.convertStr("What"));
        System.out.println(hmt.convertStr("the"));
        System.out.println(hmt.convertStr("heck"));
        System.out.println(hmt.convertStr("Fubar"));
        System.out.println(hmt.convertStr("Snafu"));
        System.out.println(hmt.convertStr("abcdefghijklm"));
        System.out.println(hmt.convertStr("nopqrstuvwxyz"));
    }
}
