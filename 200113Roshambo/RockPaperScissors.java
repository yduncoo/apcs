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
		String replay = "y";
		while(replay.equals("y"))
		{
			System.out.println("Rock-Paper-Scissors - pick your weapon[R,P,S]:: ");
			Scanner playerIn = new Scanner(System.in);
			RockPaperScissors(playerIn.nextLine());
			System.out.println(determineWinner() + "\n" + toString());
			System.out.println("Do you want to play again? ");
			replay = playerIn;
		}

		playerIn.close();
	}

	public RockPaperScissors(String player)
	{
		playChoice = player;

		int rng = (int)(Math.random() * 3) + 1; // 1 = r, 2 = p, 3 = s
		switch(rng)
		{
			case 1:
				compChoice = "R";
				break;
			case 2:
				compChoice = "P";
				break;
			case 3:
				compChoice = "S";
				break;
		}
	}

	public String determineWinner()
	{
		String winner="";

		if(playChoice.equals(compChoice))
		{
			winner = "!Draw Game!";
		}
		if(playChoice.equals("R") && compChoice.equals("P"))
		{
			winner = "!Computer wins <<Paper Covers Rock>>!";
		}
		if(playChoice.equals("P") && compChoice.equals("S"))
		{
			winner = "!Computer wins <<Scissors Cuts Paper>>!";
		}
		if(playChoice.equals("S") && compChoice.euqals("R"))
		{
			winner = "!Computer wins <<Rock Breaks Scissors>>!";
		}
		if(playChoice.equals("R") && compChoice.equals("S"))
		{
			winner = "!Player wins <<Rock Breaks Scissors>>!";
		}
		if(playChocie.equals("P") && compChoice.equals("R"))
		{
			winner = "!Player wins <<Paper Covers Rock>>!";
		}
		if(playChoice.equals("S") && compChoice.equals("P"))
		{
			winner = "!Player wins <<Scissors Cuts Paper>>!";
		}

		return winner;
	}

	public String toString()
	{
		String output = "player had " + playChoice + "\ncomputer had" + compChoice;
		return output;
	}
}