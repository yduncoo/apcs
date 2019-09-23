import java.util.Scanner;
public class WeightOnOtherPlanets_Char
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your weight on Earth? ");
        double wght = input.nextInt();
        System.out.println("\n1. Jupiter");
        System.out.println("2. Saturn");
        System.out.println("3. Uranus");
        System.out.println("4. Neptune");
        System.out.print("\n    Selection? " );
        char chc = input.next().charAt(0); // we don't use nextLine here because it would read as a string?

        switch(chc)
        {
            case 'j':
            case 'J':
                wght = wght * 2.36;
                System.out.println("\nYour weight on Jupiter would be " + wght);
                break;
            case 's':
            case 'S':
                wght = wght * 0.916;
                System.out.println("\nYour weight on Saturn would be " + wght);
                break;
            case 'u':
            case 'U':
                wght = wght * 0.889;
                System.out.println("\nYour weight on Uranus would be " + wght);
                break;
            case 'n':
            case 'N':
                wght = wght * 1.12;
                System.out.println("\nYour weight on Neptune would be " + wght);
                break;
            default:
                System.out.println("\nIt has to be the first letter of the planet.");
        }
    }
}