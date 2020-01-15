import java.util.Scanner;
public class Tester
{
    public static void main(String[] args)
    {
        Scanner playerIn = new Scanner(System.in);
		String replay = "y";
		while(replay.equals("y"))
		{
			System.out.print("Rock-Paper-Scissors - pick your weapon[rock, paper, scissors]:: ");
			RockPaperScissors roshambo = new RockPaperScissors(playerIn.nextLine());
			System.out.println(roshambo.determineWinner2() + "\n" + roshambo.toString());
			System.out.print("Do you want to play again? ");
            replay = playerIn.nextLine();
            System.out.println();
		}

		playerIn.close();
    }
}