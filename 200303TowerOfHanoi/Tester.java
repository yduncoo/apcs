public class Tester
{
    public static void main(String[] args)
    {
        int numDisks = 4;

        System.out.println("Original:");
        TowersOfHanoi.towersOfHanoi(numDisks, 1, 3, 2);

        System.out.println("\nDiskTracker:");
        DiskTracker.towersOfHanoi(numDisks, 1, 3, 2);

        System.out.println("\nGrahpical:");
        Graphical hanoi1 = new Graphical(numDisks);
        hanoi1.towersOfHanoi(numDisks, 1, 3, 2);
    }
}