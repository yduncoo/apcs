public class Tester
{
    public static void main(String[] args)
    {
        Battleship game = new Battleship();

        java.util.Scanner in = new java.util.Scanner(System.in);
        System.out.print("Type start to begin: ");
        String play = in.nextLine();

        System.out.println("Turns taken: " + game.start(play));
    }
}