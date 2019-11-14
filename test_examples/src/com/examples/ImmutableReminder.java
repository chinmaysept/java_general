package com.examples;

import java.util.Date;

	public final class ImmutableReminder{
	    private final Date remindingDate;
	  
	    public ImmutableReminder (Date remindingDate) {
	        if(remindingDate.getTime() < System.currentTimeMillis()){
	            throw new IllegalArgumentException("Can not set reminder" +
	                        " for past time: " + remindingDate);
	        }
	        this.remindingDate = new Date(remindingDate.getTime());
	    }
	  
	    public Date getRemindingDate() {
	        return (Date) remindingDate.clone();
	    }
	    public static ImmutableReminder createNewInstance(Date date)
	    {
	        return new ImmutableReminder(date);
	    }
	    
	    @SuppressWarnings("deprecation")
		private static void tryModification(Date mutableField)
	    {
	        
	        mutableField.setSeconds(10);
	    }
	    
	    public static void main(String[] args) throws InterruptedException {
	    	ImmutableReminder im = ImmutableReminder.createNewInstance(new Date());
	        System.out.println(im);
	        Thread.sleep(5000);
	        tryModification(im.getRemindingDate());
	        System.out.println(im);
		}
	    
	    
	    public String toString() {
	        return " - "+ remindingDate;
	    }

	}
	
	

