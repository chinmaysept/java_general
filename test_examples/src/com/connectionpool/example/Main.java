package com.connectionpool.example;

import java.util.*; 
import java.sql.*; 

public class Main 
{ 
    public static void main (String[] args) 
    {     
        try  
        { 
            Class.forName("com.mysql.jdbc.Driver").newInstance();                          
        } 
        catch (Exception e)  
        { 
            System.err.println("Exception while loading driver"); 
            e.printStackTrace(); 
        } 
         
        try 
        {         
            ConnectionPool cp = new ConnectionPool("jdbc:mysql://localhost:3306/test","root","computer123"); 
         
            Connection [] connArr = new Connection[7]; 
         
            for(int i=0; i<connArr.length;i++) 
            { 
                connArr[i] = cp.checkout(); 
                System.out.println("Checking out..." + connArr[i]); 
                System.out.println("Available Connections ... " + cp.availableCount()); 
            }                 

            for(int i=0; i<connArr.length;i++) 
            { 
                cp.checkin(connArr[i]); 
                System.out.println("Checked in..." + connArr[i]); 
                System.out.println("Available Connections ... " + cp.availableCount()); 
            } 
        } 
        catch(SQLException sqle) 
        { 
            sqle.printStackTrace(); 
        } 
        catch(Exception e) 
        { 
            e.printStackTrace(); 
        }         
    } 
}

