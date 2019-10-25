import static java.lang.Math.*;
public class DistToLine
{
    public static double A;
    public static double B;
    public static double C;

    public static double getDist(double a, double b)
    {
        double Dist = (abs((A * a)+ (B * b) + C )) / (sqrt((A * A) + (B * B)));
        return Dist;
    }
}