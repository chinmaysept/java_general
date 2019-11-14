package com.example.dice;

public class PairOfDice
{
   private Die d1, d2;
   private int value1, value2, total;

   //-----------------------------------------------------------------
   //  Creates two six-sided Die objects, both with an initial
   //  face value of one.
   //-----------------------------------------------------------------
   public PairOfDice ()
   {
      d1 = new Die();
      d2 = new Die();
      value1 = 1;
      value2 = 1;
      total = value1 + value2;
   }

   //-----------------------------------------------------------------
   //  Rolls both dice and returns the combined result.
   //-----------------------------------------------------------------
   public void roll ()
   {
       d1.roll();
       d2.roll();
   }

   //-----------------------------------------------------------------
   //  Returns the current combined dice total.
   //-----------------------------------------------------------------
   public int getDiceSum ()
   {
	   total = getDie1() + getDie2();
      return total;
   }

   //-----------------------------------------------------------------
   //  Returns the current value of the first die.
   //-----------------------------------------------------------------
   public int getDie1 ()
   {
      return value1;
   }

   //-----------------------------------------------------------------
   //  Returns the current value of the second die.
   //-----------------------------------------------------------------
   public int getDie2 ()
   {
      return value2;
   }
	
	//-----------------------------------------------------------------
   //  Sets the FaceValue of the first die.
   //-----------------------------------------------------------------
	public void setDie1 (int value)
	{
		d1.setFaceValue(value);
	}
	
	//-----------------------------------------------------------------
   //  Sets the FaceValue of the second die.
   //-----------------------------------------------------------------
	public void setDie2(int value)
	{
		d2.setFaceValue(value);
	}
	
	//-----------------------------------------------------------------
   //  Sets the FaceValue of the second die.
   //-----------------------------------------------------------------
	public String toString()
   {
	String result = "You rolled a " + total;

	return result;
   } 
	
}

