public class LinearFunction implements LinearFunctionMethods
{
    private double m;
    private double b;

    public LinearFunction(double slope, double yIntc)
    {
        m = slope;
        b = yIntc;
    }

    public double getSlope()
    {
        return m;
    }

    public double getYintercept()
    {
        return b;
    }

    public double getRoot()
    {
        return ((-b)/m);
    }

    public double getYvalue(double x)
    {
        return ((m * x) + b);
    }
    
    public double getXvalue(double y)
    {
        return ((y - b) / m);
    }
}