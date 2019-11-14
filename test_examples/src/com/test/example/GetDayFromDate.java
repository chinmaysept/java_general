package com.test.example;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GetDayFromDate {
	 
    public static void main(String[] args) {
 
        Date now = new Date();
 
        SimpleDateFormat simpleDateformat = new SimpleDateFormat("E"); // the day of the week abbreviated
        System.out.println("Date Formatted..."+simpleDateformat.format(now));
 
        simpleDateformat = new SimpleDateFormat("EEEE"); // the day of the week spelled out completely
         String str = simpleDateformat.format(now);
        System.out.println("Complete Day..."+simpleDateformat.format(now));
 
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(now);
        System.out.println("Day of the week..."+calendar.get(Calendar.DAY_OF_WEEK)); // the day of the week in numerical format
        
        switch(str) {
          case "Saturday":
        	  System.out.println("value");
        }
 
    }
}
