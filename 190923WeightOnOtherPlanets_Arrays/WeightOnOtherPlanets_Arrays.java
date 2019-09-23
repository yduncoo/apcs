import java.util.Scanner;
public class WeightOnOtherPlanets_Arrays
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your weight on Earth? ");
        double wght = input.nextInt();
/*        System.out.println("\n1. Jupiter");
        System.out.println("2. Saturn");
        System.out.println("3. Uranus");
        System.out.println("4. Neptune"); */
//        int[] num = {1, 2, 3, 4};
        String[] planet = {"Jupiter", "Saturn", "Uranus", "Neptune"};
        double[] ratio = {2.36, 0.916, 0.889, 1.12};

        for(int i = 0; i < planet.length; i++)
        {
            System.out.println((i + 1) + ". " + planet[i]);
        }

        System.out.print("\n    Selection? " );
        int chc = input.nextInt() - 1;
        wght = wght * ratio[chc];
        System.out.println("\nYour weight on "+ planet[chc] + " would be " + wght);

/*        switch(chc)
        {
            case 1:
                wght = wght * 2.36;
                System.out.println("\nYour weight on Jupiter would be " + wght);
                break;
            case 2:
                wght = wght * 0.916;
                System.out.println("\nYour weight on Saturn would be " + wght);
                break;
            case 3:
                wght = wght * 0.889;
                System.out.println("\nYour weight on Uranus would be " + wght);
                break;
            case 4:
                wght = wght * 1.12;
                System.out.println("\nYour weight on Neptune would be " + wght);
                break;
            default:
                System.out.println("\nIt has to be 1, 2, 3, or 4.");
        } */
    }
}