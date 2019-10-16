public class Lab14c
{
    public static void main(String[] args)
    {
        double[] array = {50.0, 100.0, 80.0};
        double big = array[0];

        for(int i = 1; i < array.length; i++)
        {
            double small = array[i];

            if(big < small)
            {
                big = small;
            }
        }

        System.out.println("biggest = " + big);
    }
}