import info.gridworld.actor.*;
import info.gridworld.grid.*;
import java.util.ArrayList;
public class UnleaveBoiCritter extends Critter
{
    public void act()
    {
        int r = (int)((Math.random() * 10) + 1);
        int c = (int)((Math.random() * 10) + 1);
        if(getLocation() == null)
        {
            putSelfInGrid(getGrid(), new Location(r,c));
        }

        super.act();
    }

    public void processActors(ArrayList<Actor> actors)
    {
        for(Actor a : actors)
        {
            Location aLoc = a.getLocation();
            Grid aGrid = a.getGrid();
            a.removeSelfFromGrid();
            UnleaveBoiCritter boi = new UnleaveBoiCritter();
            boi.putSelfInGrid(aGrid, aLoc);
        }
    }
}