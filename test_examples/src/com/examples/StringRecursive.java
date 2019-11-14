package com.examples;

public class StringRecursive 
{
    public String reverse(String str) 
    {     
        if ((str==null)||(str.length() <= 1) )
            return str;
        return reverse(str.substring(1)) + str.charAt(0);
    }
    public static void main(String[] args) 
    {
        StringRecursive obj=new StringRecursive();
        String str = "Quora";
        System.out.println("Reverse of \'"+str+"\' is \'"+obj.reverse(str)+"\'");    
    }    
}
