import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
public class BugRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        world.add(new ZBug(Integer.parseInt(args[0])));
        world.add(new Rock());
        world.show();
    }
}
