public class Insertion
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

    public static void sort(int[] a) // This will do an ascending sort
    {
        int itemToInsert, j;
        boolean keepGoing;
        // On kth pass, insert item k into its correct position among the first k items in the array
        for(int k = 1; k < a.length; k++)
        {
            // Go backwards through the list, looking for the slot to insert a[k]
            itemToInsert = a[k];
            j = k - 1;
            keepGoing = true;
            while((j >= 0) && keepGoing)
            {
                if(itemToInsert < a[j])
                {
                    a[j + 1] = a[j]; // Salient feature
                    j--;
                    if(j == -1) // special case for inserting an item at [0]
                    {
                        a[0] = itemToInsert;
                    }
                }
                else // Upon leaving loop, j + 1 is the index where itemToInsert belongs
                {
                    keepGoing = false;
                    a[j + 1] = itemToInsert;
                }
            }
        }
    }
}