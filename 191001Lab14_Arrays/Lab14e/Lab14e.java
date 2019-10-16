public class Lab14e
{
    public static void main(String[] args)
    {
        int[] array1 = {1, 5, 3, 4, 5, 5, 5, 4, 3, 2, 5, 5, 5, 3};
        int[] array2 = {2, 3, 4, 5, 6, 7, 8, 9, 0, 2, 3, 5, 6, 8, 8, 8, 9, 4, 5};
        int[] array3 = {2, 3, 4, 5, 6, 7, 8, 2, 0, 2, 3, 5, 6, 8, 8, 8, 9, 4, 5};

        System.out.println(numOf(array1));
        System.out.println(numOf(array2));
        System.out.println(numOf(array3));
    }

    public static void numOf(int[] a)
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

        for(int i = 0; i <= a.length; i++)
        {
            int num = a[i];
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

            System.out.println("0 - " + zero);
            System.out.println("1 - " + one);
            System.out.println("2 - " + two);
            System.out.println("3 - " + three);
            System.out.println("4 - " + four);
            System.out.println("5 - " + five);
            System.out.println("6 - " + six);
            System.out.println("7 - " + seven);
            System.out.println("8 - " + eight);
            System.out.println("9 - " + nine);

        }
    }
}