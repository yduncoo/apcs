import java.util.Scanner;
import java.lang.Math;
public class Lab08j
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Binary number: ");
        String bin = input.nextLine();

        int base10;
        int total = 0;
        int pwr  = 0;

        for(int i = (bin.length() - 1); i >= 0; i--)
        {
            char what = bin.charAt(i);

            switch(what)
            {
                case '1':
                    base10 = (int) Math.pow(2,pwr);
                    total = base10 + total;
            }

            pwr++;
        }
        System.out.println(bin + " == " + total);
    }
}