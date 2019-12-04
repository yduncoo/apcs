public class Robot
{
    private int[] hall;
    private int pos;             // current position(tile number) of Robot
    private boolean facingRight; // true means this Robot is facing right
  
    public Robot()
    {
        hall = new int[] { 1, 1, 2, 2};
        pos = 1;
        facingRight = true;
    }
  
    public boolean forwardMoveBlocked()
    {
        boolean blocked = false;
        if ( (pos == 0 && !facingRight) || (pos == hall.length - 1 && facingRight) )
        {   blocked = true;   }
        return blocked;
    }
    
    public void move()
    {
        if (hall[pos] > 0)
        {   hall[pos]--;   }
        if (hall[pos] > 0)
        {   return;   }
        else
        {
            if ( ! forwardMoveBlocked() )
            {
                if (facingRight)
                {   pos++;   }
                else
                {   pos--;   }
            }
            else
            {
                facingRight = !facingRight;  // switch directions
            }
        }
    }
    
    // postcondition: no more items remain in the hallway;
    //                returns the number of moves made
    public int clearHall()
    {
        int numMoves = 0;
        while (! hallIsClear() )
        {
            numMoves++;
            move();
        }
        return numMoves;
    }
    
    // postcondition: returns true if the hallway contains no items;
    //                otherwise, returns false
    private boolean hallIsClear()
    {
        for (int i : hall)
        {
            if (i > 0)
            {
                return false;   
            }
        }
        return true;
    }

    public boolean getFacingRight()
    {
        return facingRight;
    }

    public void setFacingRight(boolean c)
    {
        facingRight = c;
    }

    public int getHall()
    {
        return hall[getPos()];
    }

    public int getPos()
    {
        return pos;
    }

    public void setHall(int a)
    {
        hall[getPos()] = a; 
    }

    public void setPos(int b)
    {
        pos = b;
    }
}