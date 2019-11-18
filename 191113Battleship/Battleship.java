public class Battleship
{
    private int[] board;
    private int turn = 0;

    public Battleship()
    {
        board = new int[15];
        java.util.Arrays.fill(board, 0);

        for(int i = 0; i < board.length; i++)
        {
            int rndm = (int) (java.lang.Math.random() * 10);
            if((rndm < 6) && (i < board.length - 2) && (board[i] == 0))
            {
                board[i] = 1;
            }
        }
    }

    public int start()
    {
        java.util.Scanner guess = new java.util.Scanner(System.in);

        printBoard();

        while(!gameOver())
        {
            System.out.print("Enter a guess: ");
            int pos = guess.nextInt();

            turn++;
            
            check(pos - 1);
        }

        return turn;
    }

    private void printBoard()
    {
        System.out.println("");

        for(int i = 0; i < board.length; i++)
        {
            System.out.print("[" + board[i] + "] ");
        }

        System.out.println("");

        for(int i = 0; i < board.length; i++)
        {
            if(i < 9)
            {
                System.out.print(" " + (i + 1) + "  ");
            }
            if(i > 8)
            {
                System.out.print(" " + (i + 1) + " ");
            }
        }

        System.out.println("");
    }

    private void check(int a)
    {
        if(board[a] == 1)
        {
            board[a] = -1;
            System.out.println("Hit");
            printBoard();
        }
        else
        {
            System.out.println("Miss");
            printBoard();
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