import java.util.Scanner;
public class Lab08b
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Start: ");
        int start = input.nextInt();

        System.out.print("Stop: ");
        int stop = input.nextInt();
        
        System.out.print("Increment: ");
        int increment = input.nextInt();
        
        for(; start < stop; start =  start + increment)
        {
            System.out.print(start + " ");
        }
    }
}