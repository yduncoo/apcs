public class Battleship
{
    private int[] board;
    private int turn = 0;

    public Battleship()
    {
        board = new int[5];

        board[0] = 0;
        board[1] = 1;
        board[2] = 1;
        board[3] = 1;
        board[4] = 0;
    }

    private void printBoard()
    {
        for(int i = 0; i < board.length; i++)
        {
            System.out.print("[" + board[i] + "]");
        }
        System.out.println("");
    }

    public int start(String p)
    {
        if(p.equals("Start"))
        {
            java.util.Scanner guess = new java.util.Scanner(System.in);

            while(!gameOver())
            {
                System.out.print("Enter a guess: ");
                int pos = guess.nextInt();

                turn++;
            
                check(pos - 1);
            }
        }

        return turn;
    }

    private void check(int a)
    {
        if(board[a] == 1)
        {
            board[a] = -1;
            printBoard();
            System.out.println("Hit\n");
        }
        else
        {
            printBoard();
            System.out.println("Miss\n");
        }
    }

    private boolean gameOver()
    {
        boolean status = true;
        for(int i = 0; i < board.length; i++)
        {
            if(board[i] == 1)
            {
                status = false;
                break;
            }
        }
        return status;
    }


}