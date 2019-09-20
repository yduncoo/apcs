import java.util.Scanner;
public class Lab08e
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Number multiplied: ");
        int num1 = input.nextInt();

        System.out.print("Up to what number?: ");
        int num2 = input.nextInt();

        for(int i = 1; i <= num2; i++)
        {
            int num3 = i * num1;
            System.out.println(i + " " + num3);
        }
    }
}