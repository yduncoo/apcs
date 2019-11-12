public class Robot
{
    private int[] hall; //this for item [1,1,2,2]
    private int pos; //this for position [0,1,2,3]
    private boolean faceRight;
    public Robot(int[] a, int b)
    {
        hall = a;
        pos = b;
        faceRight = true;
    }
    /*public void setHall(int b, int c)
    {
        {
            hall[b] = hall[b] + c;
        }
    }

    private void setPos()
    {
        for(int i = 0; i < hall.length; i++)
        {
            pos[i] = i;
        }
    }

    public void setFaceRight(boolean d)
    {
        faceRight = d;
    }

    public int getHall(int e)
    {
        return hall[e];
    }

    public int getPos(int f)
    {
        return pos[f];
    }

    public boolean getFaceRight()
    {
        return faceRight;
    }*/

    private boolean forwardMoveBlocked()
    {
        if(((pos == 0) && (faceRight == false)) || ((pos == hall.length - 1) && (faceRight == true)))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    private void move()
    {
        if(hall[pos] > 0)
        {
            hall[pos] -= 1;
        }
        if(!forwardMoveBlocked())
        {
            if(faceRight)
            {
                pos += 1;
            }
            if(!faceRight)
            {
                pos -= 1;
            }
        }
        else if(forwardMoveBlocked())
        {
            faceRight = !faceRight;
        }
    }
    

    public int clearHall()
    {
        int turn = 0;
        while(!hallIsClear())
        {
            move();
            turn++;
        }
        return turn;
    }

    private boolean hallIsClear()
    {
        int sum = 0;
        for(int i = 0; i < hall.length; i++)
        {
            sum = sum + hall[i];
        }
        return(sum == 0);
    }
}