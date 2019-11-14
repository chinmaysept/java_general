package com.test.example;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang3.time.DateUtils;

public class DateManipulation {
	
	public static void main(String args[]) { 
		//Using Calendar to increment and decrement days from date in Java 
		Date today = new Date(); System.out.println("Today is " + toddMMyy(today)); 
		Calendar cal = Calendar.getInstance(); 
		//adding one day to current date 
		cal.add(Calendar.DAY_OF_MONTH, 1); 
		Date tommrrow = cal.getTime(); 
		System.out.println("Tomorrow will be " + toddMMyy(tommrrow));
		//substracting two day from date in Java 
		cal.add(Calendar.DAY_OF_MONTH, -2);
		Date yesterday = cal.getTime(); 
		System.out.println("Yesterday was " + toddMMyy(cal.getTime()));
		//Using Apache commons DateUtils to increment and decrement date in Java 
		Date increment = DateUtils.addDays(today, 1); 
		System.out.println("Increment one day to date in Java using DateUtils " + toddMMyy(increment)); 
		Date decrement = DateUtils.addDays(today, -1); 
		System.out.println("Decrement one day from date in Java " + toddMMyy(decrement));
		Date lastWeek = DateUtils.addWeeks(today, -1);
		System.out.println("The last week date..."+toddMMyy(lastWeek));
		//adding 27 days to current date in Java, to see if month rolls 
		Date dateAfter27Days = DateUtils.addDays(today, 27); 
		System.out.println("Date after 27 days " + toddMMyy(dateAfter27Days)); 
		//adding 305 days to current date to check if year rolls or not 
		Date afterManyDays = DateUtils.addDays(today, 305); 
		System.out.println("Date after 305 days in Java " + toddMMyy(afterManyDays));
		} 
	public static String toddMMyy(Date day){ 
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yy");
		String date = formatter.format(day); 
		return date;
		}
	}

		

