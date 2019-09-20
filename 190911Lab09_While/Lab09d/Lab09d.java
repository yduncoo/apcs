import java.util.Scanner;
public class Lab09d
{
    public static void main(String[] args)
    {
        Scanner inNum = new Scanner(System.in);
        System.out.print("Number: ");
        int num = inNum.nextInt();
        int sum = 0;

        while(num > 0)
        {
            sum = (sum + (num % 10));
            num = num / 10;
        }

        System.out.println(sum);
    }
}