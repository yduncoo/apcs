import java.util.Scanner;
public class Lab09c
{
    public static void main(String[] args)
    {
        Scanner inNum = new Scanner(System.in);
        System.out.print("Number: ");
        int num = inNum.nextInt();
        int rev = 0;

        while(num > 0)
        {
            rev = ((rev * 10) + (num % 10));
            num = num / 10;
        }

        System.out.println(rev);
    }
}