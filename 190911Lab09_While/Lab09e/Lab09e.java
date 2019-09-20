import java.util.Scanner;
public class Lab09e
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Number: ");
        int num = input.nextInt();

        System.out.print("\n" + num + " has divisors");
        int i = 1;

        while(i < num)
        {
            if((num % i) == 0)
            {
                System.out.print(" " + i);
            }

            ++i;
        }

        System.out.print("\n");
    }
}