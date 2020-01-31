import info.gridworld.actor.Bug;
public class DancingBug extends Bug
{
    private int steps;
    private int sideLength;
    private int[] turns;
    private int turnCount;

    // when using this in bluej or any program, in the args sectnion the first number in the string array will be the length that the bug will travel.
    // all numbers after will be the turns that it will take
    public DancingBug(String[] numS)
    {
        // when using args array to assign length and turn numbers it will use args[0] for assigning length
        sideLength = Integer.parseInt(numS[0]);
        // all numbers after args[0] will be for the turn counts
        turns = new int[numS.length];
        for(int i = 1; i < numS.length; i++)
        {
            turns[i - 1] = Integer.parseInt(numS[i]);
        }
        turnCount = 0;
    }

    public void act()
    {
        if(steps < sideLength && canMove())
        {
            move();
            steps++;
        }
        else if(steps == sideLength && canMove() && turnCount < turns.length)
        {
            for(int j = 0; j < turns[turnCount]; j++)
            {
                turn();
            }
            if(turnCount < turns.length - 1)
            {
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