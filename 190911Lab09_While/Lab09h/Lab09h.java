import java.util.Scanner;
public class Lab09h
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Number: ");
        int num = input.nextInt();
        int num2 = 0;
        int i = 1;

        while(i < num)
        {
            if((num % i) == 0)
            {
                num2 = num2 + i;
            }

            i++;
        }

        if(num2 == num)
        {
            System.out.println(num + " is perfect.");
        }
        else
        {
            System.out.println(num + " is not pefect.");
        }
    }
}