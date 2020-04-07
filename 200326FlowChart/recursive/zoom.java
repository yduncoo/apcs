import java.util.ArrayList;
import java.util.Scanner;

public class zoom
{
    public static void main(String[] args)
    {
        Scanner kbin = new Scanner(System.in);

        System.out.print("What is the number? ");
        long n = kbin.nextLong();

        recursive(n);

        kbin.close();
    }

    public static void recursive(long n)
    {
        ArrayList<Long> factors = new ArrayList<Long>();
        
        long startTime = System.nanoTime();

        long d = 1;
        long outside = n / 2;

        loopy(n, d, outside, factors);

        long endTime = System.nanoTime();
        double elapsedTime = (endTime - startTime) / 1000000000.0;

        for(long i : factors)
        {
            System.out.print(i + " ");
        }
        System.out.print(n);

        System.out.println("\nYour algorithm took " + (elapsedTime) + " seconds to run.");
    }

    public static void loopy(long n, long d, long outside, ArrayList<Long> factors)
    {
        if(d >= outside)
        {
            return;
        }
        else if(n % d == 0)
        {
            factors.add(d);
        }

        loopy(n, d + 1, outside, factors);
    }
}