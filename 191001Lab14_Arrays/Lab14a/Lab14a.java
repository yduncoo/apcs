import java.util.Arrays;
public class Lab14a
{
     public static void main(String[] args)
    {
		int[] one = {4,10,0,1,7,6,5,3,2,9};

		System.out.println(Arrays.toString(one));
		System.out.println("sum of spots 3-6  =  " + getSum(one, 3, 6));
		System.out.println("sum of spots 2-9  =  " + getSum(one, 2, 9));
		System.out.println("# of 4s  =  " + getCount(one, 4));		
		System.out.println("# of 9s  =  " + getCount(one, 9));				

		int[] two = {4,2,3,4,6,7,8,9,0,10,0,1,7,6,5,3,2,9,9,8,7};

		System.out.println(Arrays.toString(two));
		System.out.println("sum of spots 3-16  =  " + getSum(two, 3, 16));
		System.out.println("sum of spots 2-9  =  " + getSum(two, 2, 9));
		System.out.println("# of 0s  =  " + getCount(two, 0));		
		System.out.println("# of 4s  =  " + getCount(two, 4));				

    }

    public static int getSum(int[] zip, int a, int b)
    {
        int total = 0;

        for(int j = a - 1 ; j < b ; j++)
        {
           total = total + zip[j];
           //System.out.println("~" + total); //used to test where i went wrong but it was the lab
        }

        return(total);
    }


    public static int getCount(int[] zip, int c)
    {
        int count = 0;

        for(int i = 0; i < zip.length; i++)
        {
            if(c == zip[i])
            {
                count++;
            }
        }
        return(count);
    }

   
}