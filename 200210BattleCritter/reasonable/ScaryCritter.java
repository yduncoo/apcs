package info.gridworld.actor;
import info.gridworld.grid.Location;
import java.util.ArrayList;
public class ScaryCritter extends Critter
{
    public void processActors(ArrayList<Actor> actors)
    {
        for(Actor a : actors)
        {
            if(!(a instanceof Rock) && !(a instanceof Critter))
            {
                a.setDirection(a.getDirection() + Location.HALF_CIRCLE);
                a.act();
            }
        }
    }
}