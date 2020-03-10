public class Merge
{
    public static void main(String[] args)
    {
        int[] theArray = {4, 2, 5, 1, 3, 18, 0, 9, 6};
        sort(theArray, 0, theArray.length - 1);

        for(int j = 0; j < theArray.length; j++)
        {
            System.out.print(theArray[j] + " ");
        }
        System.out.println(" ");
    }

    // Enter this method with left = the beginning index (initially 0) and right = the last index
    // (initially a.length - 1)
    public static void sort(int[] a, int left, int right)
    {
        if(right == left)
        {
            return;
        }
        int middle = (left + right) / 2; // salient feature #1
        sort(a, left, middle); // salient feature #2 (recursion)
        sort(a, middle + 1, right); // salient feature #3
        merge(a, left, middle, right); // salient feature #4
    }
    // ...see two pages forward for the merge method, an important component of this sorting technique.

    private static void merge(int[] a, int left, int middle, int right)
    {
        // This temporary array will be used to build the merged list
        int[] tmpArray = new int[right - left + 1];
        // This creation of a temporary array is a BIG feature of the merge sort.

        int index1 = left;
        int index2 = middle + 1;
        int indx = 0;

        // Loop until one of the sublists is finished, adding the smaller of the first
        // elements of each sublist to the merged list.
        while(index1 <= middle && index2 <= right)
        {
            if(a[index1] < a[index2])
            {
                tmpArray[indx] = a[index1];
                index1++;
            }
            else
            {
                tmpArray[indx] = a[index2];
                index2++;
            }
            indx++;
        }

        // Add to the merged list the remaining element of whichever sublist is
        // not yet finished
        while(index1 <= middle)
        {
            tmpArray[indx] = a[index1];
            index1++;
            indx++;
        }
        while(index2 <= right)
        {
            tmpArray[indx] = a[index2];
            index2++;
            indx++;
        }

        // Copy the merged list from the tmpArray array into the a array
        for(indx = 0; indx < tmpArray.length; indx++)
        {
            a[left + indx] = tmpArray[indx];
        }
    }
}