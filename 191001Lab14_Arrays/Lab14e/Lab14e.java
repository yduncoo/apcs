import java.util.Arrays;
public class Lab14e
{
    public static void main(String[] args)
    {
        int[] array1 = {1, 5, 3, 4, 5, 5, 5, 4, 3, 2, 5, 5, 5, 3};
        int[] array2 = {2, 3, 4, 5, 6, 7, 8, 9, 0, 2, 3, 5, 6, 8, 8, 8, 9, 4, 5};
        int[] array3 = {2, 3, 4, 5, 6, 7, 8, 2, 0, 2, 3, 5, 6, 8, 8, 8, 9, 4, 5};

        System.out.println(Arrays.toString(array1)+ "\n" + numOf(array1) + "\n");
        System.out.println(Arrays.toString(array2)+ "\n" + numOf(array2) + "\n");
        System.out.println(Arrays.toString(array3)+ "\n" + numOf(array3) + "\n");
    }

    public static String numOf(int[] a)
    {
        int zero = 0;
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        int six = 0;
        int seven = 0;
        int eight = 0;
        int nine = 0;

        for(int i = 1; i <= a.length; i++)
        {
            int num = a[i - 1];
            switch(num)
            {
                case 0:
                    zero++;
                    break;
                case 1:
                    one++;
                    break;
                case 2:
                    two++;
                    break;
                case 3:
                    three++;
                    break;
                case 4:
                    four++;
                    break;
                case 5:
                    five++;
                    break;
                case 6:
                    six++;
                    break;
                case 7:
                    seven++;
                    break;
                case 8:
                    eight++;
                    break;
                case 9:
                    nine++;
                    break;
            }
        }

        return("0 - " + zero + "\n" + "1 - " + one + "\n" + "2 - " + two + "\n" + "3 - " + three + "\n" + "4 - " + four + "\n" + "5 - " + five + "\n" + "6 - " + six + "\n" + "7 - " + seven + "\n" + "8 - " + eight + "\n" + "9 - " + nine);
    }
}