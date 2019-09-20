import java.util.Scanner;
public class Lab08h
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Number: ");
        int num = input.nextInt();
        long fact = 1;
        int bfor = num;

        for(; num > 0; --num)
        {
            fact = fact * num;
        }

        System.out.println("factorial of " + bfor + " is " + fact);
    }
}