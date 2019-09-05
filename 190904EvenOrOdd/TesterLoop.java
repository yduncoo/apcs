import java.util.Scanner;
public class TesterLoop
{
    public static void main(String[] args)
    {
        int count = 0;

        while(count<3)
        {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter an integer: ");
            int integer = input.nextInt();

            int result = integer%2;

            if (result==0)
            {
                System.out.println("The integer " + integer + " is even");
            }
            else
            {
                System.out.println("The integer " + integer + " is odd");
            }
            count++;
        }
    }
}