import java.util.Scanner;
public class FractionTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Numerator: ");
        int nmrtr = input.nextInt();
        System.out.print("Denominator: ");
        int dnmntr = input.nextInt();

        Fraction aFraction = new Fraction(nmrtr, dnmntr);

        System.out.print("Reduce (Yes or No): ");
        String maybe = input.next();

        while(maybe.equals("Yes"))
        {
            if(maybe.equals("Yes"))
            {
                aFraction.reducible();
            }
            System.out.print("Keep reducing? (Yes or No): ");
            maybe = input.next();
            if(maybe.equals("No"))
            {
                break;
            }
        }
        

        System.out.print("Select fraction type (Horizontal or Vertical): ");
        String choice = input.next();
        
        if(choice.equals("Horizontal"))
        {
            aFraction.horizontal();
        }
        if(choice.equals("Vertical"))
        {
            aFraction.vertical();
        }
    }
}