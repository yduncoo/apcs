import info.gridworld.actor.Bug;
public class ZBug extends Bug
{
    private int steps;
    private int sideLength;
    private int turnCount;

    public ZBug(int length)
    {
        steps = 0;
        sideLength = length;
        turnCount = 1;
    }

    public void act()
    {
        if(getDirection() == 0)
        {
            turn();
            turn();
        }
        else if(steps < sideLength && canMove())
        {
            move();
            steps++;
        }
        else if(steps == sideLength && canMove())
        {
            if(turnCount == 1)
            {
                turn();
                turn();
                turn();
                steps = 0;
            }
            else if(turnCount == 2)
            {
                turn();
                turn();
                turn();
                turn();
                turn();
                steps = 0;
            }
            turnCount++;
        }
        else
        {
            return;
        }
    }
}