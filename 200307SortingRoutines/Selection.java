public class Selection
{
    public static void main(String[] args)
    {
        int[] theArray = {4, 2, 5, 1, 3, 18, 0, 9, 6};
        sort(theArray);

        for(int j = 0; j < theArray.length; j++)
        {
            System.out.print(theArray[j] + " ");
        }
        System.out.println(" ");
    }

    public static void sort(int[] a)
    {
        int min, minIndex;
        for(int i = 0; i < a.length; ++i)
        {
            min = a[i];
            minIndex = i;
            for(int j = i + 1; j < a.length; ++j) // Find minimum
            {
                if(a[j] < min) // salient feature
                {
                    min = a[j];
                    minIndex = j;
                }
            }
            a[minIndex] = a[i]; // swap
            a[i] = min;
        }
    }
}