package com.example.dice;

import java.util.Random;

public class Die
{
	  private int faceValue;
	  private final int MAX=6;
	  
	  public Die()
	  {
	  	faceValue = 1;
	  }
	  
	  //Math.random creates random integers from 1 - 6
	  public void roll()
	  {
	  	faceValue = (int)(Math.random() * MAX) +1;
	  }
	  
	  //Sets the face value
	  public void setFaceValue(int value)
	  {
	 	faceValue=value;
	  }
	  
	  //Gets the face value using the setFaceValue method
	  public int getFaceValue()
	  {
	  	return faceValue;
	  }
	  
	  //Converts values into a String
	  public String toString()
	  {
	  	String result = "You rolled a " + faceValue;
	
		return result;
	  }
	  
}// end class Die

