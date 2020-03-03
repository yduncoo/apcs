import info.gridworld.actor.*;
import info.gridworld.grid.*;
import java.util.ArrayList;
public class RockEater extends Critter
{
    public ArrayList<Location> getMoveLocations()
    {
        ArrayList<Location> filled = getGrid().getOccupiedLocations();
        ArrayList<Location> rockLocs = new ArrayList<Location>();
        for(int i = 0; i < filled.size(); i++)
        {
            if((getGrid().get(filled.get(i)) instanceof Rock) && !(getGrid().get(filled.get(i)) instanceof RockDropper))
            {
                rockLocs.add(getGrid().get(filled.get(i)).getLocation());
            }
        }
        return rockLocs;
    }
}