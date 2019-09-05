import java.io.*;
import java.util.*;
public class Tester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int integer = input.nextInt();

        int result = integer%2;

        int count = 0;

        while(count<3)
        {
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