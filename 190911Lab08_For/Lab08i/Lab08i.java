import java.util.Scanner;
public class Lab08i
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Number: ");
        int num = input.nextInt();
        char what = 2;

        for(int i = 2; i < Math.sqrt(num); i++)
        {
            if(((num % i) == 0) && (i < num))
            {
                System.out.println(num + " is not prime.");
                what = 1;
                break;
            }
        }
        switch(what)
        {
            case 1:
                break;
            default:
                System.out.println(num + " is prime.");
        }
    }
}