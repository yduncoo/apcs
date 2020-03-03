import info.gridworld.actor.*;
import info.gridworld.grid.*;
import java.util.ArrayList;
import java.awt.Color;
public class RockDropper extends Critter
{
    public RockDropper()
    {
        setColor(Color.BLACK);
    }
    public RockDropper(Color clr)
    {
        setColor(clr);
    }
    public void makeMove(Location loc)
    {
        if(loc == null || loc == getLocation())
        {
            return;
        }
        else
        {
            Location prevLoc = getLocation();
            super.makeMove(loc);
            Rock rock = new Rock(getColor());
            rock.putSelfInGrid(getGrid(), prevLoc);
        }
    }
}