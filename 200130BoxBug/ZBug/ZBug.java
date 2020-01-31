import info.gridworld.actor.Bug;
public class ZBug extends Bug
{
    private int steps;
    private int sideLength;

    public ZBug(int length)
    {
        steps = 0;
        sideLength = length;
    }

    public void act()
    {

        if(steps < sideLength && canMove())
        {
            move();
            steps++;
        }
        if(steps == sideLegnth && canMove())
        {
            if(getDirection() == 90)
            {
                turn();
                turn();
                turn();
                steps = 0;
                turnCount++;
            }
            else
            {
                turn();
                turn();
                turn();
                turn();
                turn();
                steps = 0;
            }
        }
        else
        {
            return;
        }
    }
}