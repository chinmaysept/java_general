package com.example.dice;

import java.util.Scanner;

public class DiceGame
{
	public static void main( String [] args )
	{
		//Rules of the Game
		System.out.println("______________________________________");
		System.out.println("/          Rules of the Game         /");
		System.out.println("/          -----------------         /");
		System.out.println("/  1)It's you vs computer.           /");
		System.out.println("/  2)You play by rolling the dice.   /");
		System.out.println("/  3)The first player to reach 100   /");
		System.out.println("/     points wins.                   /");
		System.out.println("/  4)When a player rolls a 1         /");
		System.out.println("/     the turn is over.              /");
		System.out.println("/  5)The computer's turn is over     /");
		System.out.println("/    when turn total reach 20 points /");
		System.out.println("/    in a single turn.               /");
		System.out.println("______________________________________");
		
		PairOfDice d1 = new PairOfDice(); //Creating PairOfDice object
		
		int turnTotal = 0;
		int computerTotal = 0; //your total
		int playerTotal = 0; //computer's total
		int turnOver = 1; //when to give up die
		int winner = 100; // amount to be reached before winning
		
		Scanner in = new Scanner( System.in );
		String answer; // named of what will take answer from user
		
		// first do-while loop is for repeating the change between user and computer
		do{
			if (playerTotal <= winner && computerTotal <= winner)
			{
				System.out.println("Your turn.");
				
				// do-while loop for the player's turn.
				do
				{
				System.out.println("Type 'y' if ready and 'n' to end turn.");
				answer = in.next();
				
				if (answer.equalsIgnoreCase("y") && playerTotal <= winner && computerTotal <= winner)
				{
					d1.roll();
					d1.getDie1();
					d1.getDie2();
					d1.toString();
					System.out.println(d1);					
					
					// if and else statement to figure out whether user's turn is over or not.
					if (d1.getDie1() == turnOver || d1.getDie2() == turnOver){
						System.out.println("You rolled a 1. Your turn is over.");
						System.out.println("Please type 'done' when you are ready to turn the dice over to the Computer.");
						answer = in.next();
					}
					else
					{
						turnTotal = turnTotal + d1.getDiceSum();
						playerTotal = playerTotal + d1.getDiceSum();
						System.out.println("Your Turn Total: " + turnTotal);
						System.out.println("Your Grand Total: " + playerTotal);
					}
				}
				}
				
				while (answer.equalsIgnoreCase("y") && playerTotal <= winner && computerTotal <= winner);
				turnTotal = 0; // turntotal assigned to 0 again.
				System.out.println();
				System.out.println("Your Grand Total is: " + playerTotal);
				System.out.println("The Computer's Grand Total is: " + computerTotal);
				System.out.println();
			
				//Begin the Computer's turn
				int endComputerTurn = 20;//when to end computer's turn
				turnOver = 1; //what die equals for turn to be over
				int answercomp = 1; 
				
				do
				{
					if (turnTotal <= endComputerTurn && answercomp == 1 && playerTotal <= winner && computerTotal <= winner)
					{
						d1.roll();
						d1.getDie1();
						d1.getDie2();
						d1.toString();
						System.out.println(d1);
								if (d1.getDie1() == turnOver || d1.getDie2() == turnOver)
								{
									System.out.println("The Computer rolled a 1. Their turn is over.");
									answercomp = 0;
								}
								
								else
								{
									turnTotal = turnTotal + d1.getDiceSum();
									computerTotal = computerTotal + d1.getDiceSum();
									System.out.println("The Computer's Turn Total is: " + turnTotal);
									System.out.println("The Computer's Grand Total is: " + computerTotal);
								}
					}
				}
				
				while (turnTotal <= endComputerTurn && answercomp == 1 && playerTotal <= winner && computerTotal <= winner);
				turnTotal = 0; //turntotal assigned to 0 again.
			
				if (playerTotal <= winner || computerTotal <= winner)
				{
					System.out.println();
					System.out.println("The Computer's Grand Total is: " + computerTotal);
					System.out.println("Your Grand Total is: " + playerTotal);
					System.out.println();
				}
			
				else
				{
				System.out.println();
				System.out.println();
				}
			}
		}
		
		while(playerTotal <= winner && computerTotal <= winner);
		
		// if-else statements to check if there is a winner
		if (playerTotal >= winner)
			System.out.println("You win!");
		else
			System.out.println("You lose ): ");
	
	}
}

