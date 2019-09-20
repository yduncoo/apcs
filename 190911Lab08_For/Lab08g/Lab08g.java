import java.util.Scanner;
public class Lab08g
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Start number: ");
        int start = input.nextInt();
        System.out.print("Stop number: ");
        int stop = input.nextInt();

        int total = 0;
        int even = 0;
        int odd = 0;

        for(; start <= stop; ++start)
        {
            total = start + total;
            
            if((start % 2) == 0)
            {
                ++even;
            }
            else
            {
                ++odd;
            }
        }

        System.out.println("total " + total);
        System.out.println("even count " + even);
        System.out.println("odd count " + odd);
    }
}