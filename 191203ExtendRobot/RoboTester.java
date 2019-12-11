public class RoboTester
{
    public static void main(String[] args)
    {
        Robot joomba = new Robot();
        int steps = joomba.clearHall();
        System.out.println("Joomba cleared the hall in " + steps + " moves.");
        
        Robot twosucc = new HeavyDuty();
        steps = twosucc.clearHall();
        System.out.println("twosucc cleared the hall in " + steps + " moves.");
    }
}
