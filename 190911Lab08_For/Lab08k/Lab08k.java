import java.util.Scanner;
public class Lab08k
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("First number: ");
        int num1 = input.nextInt();
        System.out.print("Second number: ");
        int num2 = input.nextInt();

        for(int i = num1; i > 0; i++)
        {
            if(((num1 % i) == 0) && ((num2 % i) == 0))
            {
                System.out.println("the gcd of " + num1 + " and " + num2 + " is " +i);
                break;
            }
        }
    }
}