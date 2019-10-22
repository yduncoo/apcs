public class SmallestCommonNumber
{
    public static void main(String[] args)
    {
        int[] nums1 = {1, 2, 4, 6, 7, 9, 13, 14, 17};
        int[] nums2 = {0, 3, 5, 8, 9, 11, 12, 14, 17, 18, 20};

        System.out.println("Brute force: " + lwstCmmn1(nums1, nums2));
        System.out.println("Elegant way: " + lwstCmm2(nums1, nums2));
    }

    public static int lwstCmmn1(int[] a, int[] b)
    {
        int i = 0;
        int j = 0;

        loop:
            for(i = 0; i < a.length; i++)
            {
                for(j = 0; j < b.length; j++)
                {
                    //System.out.print("~" + a[i] + "\n" + "~" + b[j]);
                    if(a[i] == b[j])
                    {
                        break loop;
                    }
                }
            }

        return a[i];
    }

    public static int lwstCmm2(int[] a, int[] b)
    {
        int j = 0;
        int k = 0;
        
            for(int i = 0; i == 0;)
            {
                if(a[j] < b[k])
                {
                    j++;
                }
                if(b[k] < a[j])
                {
                    k++;
                }
                if(a[j] == b[k])
                {
                    break;
                }
                //System.out.println("~f" + a[j] + "~s" + b[k]);
            }

        return a[j];
    }
}