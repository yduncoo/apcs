//� A+ Computer Science  -  www.apluscompsci.com
//Name - Ethan Su
//Date - 01/13/20
//Class - AP Computer Science
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
	}

	public RockPaperScissors(String player)
	{
		playChoice = player;

		int rng = (int)(Math.random() * 3) + 1; // 1 = r, 2 = p, 3 = s
		switch(rng)
		{
			case 1:
				compChoice = "rock";
				break;
			case 2:
				compChoice = "paper";
				break;
			case 3:
				compChoice = "scissors";
				break;
		}
	}

	public String determineWinner2()
	{
		String winner = "";
		
		if(playChoice.equals(compChoice))
		{
			winner = "tie";
		}
		else if(playChoice.length() > compChoice.length() || playChoice.equals("rock") && compChoice.equals("scissors"))
		{
			winner = "player wins";
		}
		else
		{
			winner = "computer wins";
		}

		return winner;
	}

	public String determineWinner()
	{
		String winner="";

		if(playChoice.equals(compChoice))
		{
			winner = "!Draw Game!";
		}
		else if(playChoice.equals("R") && compChoice.equals("P"))
		{
			winner = "!Computer wins <<Paper Covers Rock>>!";
		}
		else if(playChoice.equals("P") && compChoice.equals("S"))
		{
			winner = "!Computer wins <<Scissors Cuts Paper>>!";
		}
		else if(playChoice.equals("S") && compChoice.equals("R"))
		{
			winner = "!Computer wins <<Rock Breaks Scissors>>!";
		}
		else if(playChoice.equals("R") && compChoice.equals("S"))
		{
			winner = "!Player wins <<Rock Breaks Scissors>>!";
		}
		else if(playChoice.equals("P") && compChoice.equals("R"))
		{
			winner = "!Player wins <<Paper Covers Rock>>!";
		}
		else
		{
			winner = "!Player wins <<Scissors Cuts Paper>>!";
		}

		return winner;
	}

	public String toString()
	{
		String output = "player had " + playChoice + "\ncomputer had " + compChoice;
		return output;
	}
}