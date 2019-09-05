import java.io.*;
import java.util.*;
public class RadiusOfCircle
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the area? ");
        double area = input.nextDouble();
        double PI = Math.PI;
        double adp = area/PI;
        System.out.println("Radius of your circle is " + Math.sqrt(adp) + ".");
    }
}