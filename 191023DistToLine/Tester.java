import java.util.Scanner;
public class Tester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the A value for the line: ");
        DistToLine.A = input.nextDouble();
        System.out.print("Enter the B value for the line: ");
        DistToLine.B = input.nextDouble();
        System.out.print("Enter the C value for the line: ");
        DistToLine.C = input.nextDouble();
        System.out.print("Enter the x coordinate of the point: ");
        double x = input.nextDouble();
        System.out.print("Enter the y coordinate of the point: ");
        double y = input.nextDouble();

        System.out.println("\nDistance from the point to the line is: " + DistToLine.getDist(x,y));
    }
}