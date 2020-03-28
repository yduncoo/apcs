import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class no
{
    public static void main(String[] args)
    {
        Scanner kbin = new Scanner(System.in);
        
        System.out.print("Which optimization? ");
        int choose = kbin.nextInt();

        System.out.print("What is the number? ");
        int n = kbin.nextInt();

        switch(choose)
        {
            case 1:
                one(n);
                break;

            case 2:
                two(n);
                break;

            case 3:
                three(n);
                break;
            default:
                System.out.println("Error. Please select from 1-3.");
                System.exit(0);
        }

        kbin.close();
    }

    public static void one(int n)
    {
        ArrayList<Integer> factors = new ArrayList<Integer>();

        long startTime = System.nanoTime();

        int d = 1;

        do
        {
            if(n % d == 0)
            {
                factors.add(d);
            }
            d = d + 1;
        }
        while(d <= n / 2);

        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;

        for(Integer i : factors)
        {
            System.out.print(i + " ");
        }
        System.out.print(n);

        System.out.println("\nYour algorithm took " + (elapsedTime) + "ns to run.");
    }

    public static void two(int n)
    {
        ArrayList<Integer> factors = new ArrayList<Integer>();

        long startTime = System.nanoTime();

        int d = 1;
        int outside = n / 2;

        do
        {
            if(n % d == 0)
            {
                factors.add(d);
            }
            d = d + 1;
        }
        while(d <= outside);

        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;

        for(Integer i : factors)
        {
            System.out.print(i + " ");
        }
        System.out.print(n);

        System.out.println("\nYour algorithm took " + (elapsedTime) + "ns to run.");
    }

    public static void three(int n)
    {
        ArrayList<Integer> factors = new ArrayList<Integer>();

        long startTime = System.nanoTime();

        int d = 1;
        int last = (int) Math.sqrt(n);

        do
        {
            if(n % d == 0)
            {
                factors.add(d);
                factors.add(n/d);
            }
            d++;
        }
        while(d <= last);

        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;

        Collections.sort(factors);
        for(Integer i : factors)
        {
            System.out.print(i + " ");
        }
        System.out.print(n);

        System.out.println("\nYour algorithm took " + (elapsedTime) + "ns to run.");
    }
}

/*
 * First: 22.996 seconds
 * Second: 22.794 seconds
 * Third: 0.001 seconds (1.5616 ms)
 * 
 * Processor: Intel(R) Core(TM) i7-6700K CPU @ 4.00GHz, 4001 Mhz, 4 Core(s), 8 Logical Processor(s)
 * Age: 5 years old
 * OS Name: Microsoft Windows 10 Home
 * JDK: 11.0.6
 */