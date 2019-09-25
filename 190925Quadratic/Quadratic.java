import java.lang.Math;
public class Quadratic
{
    public static void main(String[] args)
    {
        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[1]);
        double num3 = Double.parseDouble(args[2]);

        System.out.println(qdrtc(num1, num2, num3));
    }

    public static double qdrtc(double a, double b, double c)
    {
        double ans = ((-b + (Math.sqrt(Math.pow(b, 2) - (4 * a * c)))) / (2 * a));

        return(ans);
    }
}