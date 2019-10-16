import java.util.Arrays;
public class Lab14d
{
    public static void main(String[] args)
    {
        double[] array1 = {100, 90, 85, 72.5, 95.6};
        double[] array2 = {50.0, 100.0, 80.0};
        double[] array3 = {93.4, -90.0, 90.0};
        double[] array4 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(Arrays.toString(array1));
        System.out.println("average = " + average(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println("average = " + average(array2));
        System.out.println(Arrays.toString(array3));
        System.out.println("average = " + average(array3));
        System.out.println(Arrays.toString(array4));
        System.out.println("average = " + average(array4));

    }

    public static double average(double[] a)
    {
        double total = 0;
        for(int i = 1; i <= a.length; i++)
        {
            total = total + a[i-1];
            //System.out.println("~~total = " + total);
        }

        return(total/((double)a.length));
    }
}