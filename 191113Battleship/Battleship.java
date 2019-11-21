public class Battleship
{
    private int[][] board;
    private int turn = 0;

    public Battleship()
    {
        board = new int[10][15];
        for(int i = 0; i < board.length; i++)
        {
            java.util.Arrays.fill(board[i], 0);
        }

        for(int row = 0; row < board.length; row++)
        {
            for(int col = 0; col < board[row].length; col++)
            {
                int rndm = (int) (java.lang.Math.random() * 10);
                if(rndm < 6) //IMPLEMENT BORDER CHECK
                {
                    board[row][col] = 1;
                }
            }
        }
    }

    private boolean border(int rw, int cl)
    {
        boolean edge = false;
        
        if(board.length == ) //if position is on border return true
    }

    public int start()
    {
        java.util.Scanner guess = new java.util.Scanner(System.in);

        printBoard();

        while(!gameOver())
        {
            System.out.print("Enter a guess: ");
            String pos = guess.nextLine();

            turn++;
            
            check(pos);
        }

        return turn;
    }

    private void printBoard()
    {
        System.out.println("");

        for(int row = 0; row < board.length; row++)
        {
            for(int col = 0; col < board[row].length; col++)
            {
                System.out.print("[" + board[row][col] + "] ");
            }
            System.out.println("");
        }

        System.out.println("");

        /*for(int i = 0; i < board.length; i++)
        {
            if(i < 9)
            {
                System.out.print(" " + (i + 1) + "  ");
            }
            if(i > 8)
            {
                System.out.print(" " + (i + 1) + " ");
            }
        }*/

        System.out.println("");
    }

    private void check(String a)
    {
        char b1 = a.charAt(0);
        
        int b2 = b1;

        int c = Integer.parseInt(a.substring(1));

        if(board[b2 - 1][c - 1] == 1)
        {
            board[b][c - 1] = -1;
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
        for(int row = 0; row < board.length; row++)
        {
            for(int col = 0; col < board[row].length; col++)
            {
                if(board[row][col] == 1)
                {
                    status = false;
                    break;
                }
            }
        }
        return status;
    }
}