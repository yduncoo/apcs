public class HeavyDuty extends Robot
{
    public HeavyDuty()
    {
        super();
    }

    public void move()
    {
        if (getHall() > 0)
        {   setHall(getHall() - 2);   }
        if (getHall() > 0)
        {   return;   }
        else
        {
            if ( ! forwardMoveBlocked() )
            {
                if (getFacingRight())
                {   setPos(getPos() + 1);   }
                else
                {   setPos(getPos() - 1);   }
            }
            else
            {
                setFacingRight(!getFacingRight());  // switch directions
            }
        }    
    }
}