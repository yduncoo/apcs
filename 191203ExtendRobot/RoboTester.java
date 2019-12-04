public class RoboTester
{
    public static void main(String[] args)
    {
        Robot joomba = new Robot();
        int steps = joomba.clearHall();
        System.out.println("Joomba cleared the hall in " + steps + " moves.");
        
    }
}
