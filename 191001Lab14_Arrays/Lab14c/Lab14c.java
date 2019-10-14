public class Lab14c
{
    public static void main(String[] args)
    {
        double[] array = {-99, -84, -45, -4554, -541, -8742};
        double x = 0;
        double i = 1;
        double big = array[(int)i - 1];

        for(; i < array.length; i++)
        {
            double small = array[(int)i];

            if(big > small)
            {
                big = big;
            }
            else
            {
                big = small;
            }
            x = big;
        }

        System.out.println("biggest = " + x);
    }
}