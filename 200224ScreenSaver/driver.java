import info.gridworld.actor.*;
import info.gridworld.grid.*;
import java.awt.Color;
public class driver
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld(new BoundedGrid<Actor>(40, 70));
        world.add(new Location(21, 9), new RockDropper(new Color(89, 255, 175)));
        world.add(new Location(0, 69), new RockDropper(new Color(64, 159, 255)));
        world.add(new Location(39, 42), new RockDropper(new Color(115, 64, 255)));
        world.add(new Location(13, 9), new RockEater());
        world.show();
    }
}
