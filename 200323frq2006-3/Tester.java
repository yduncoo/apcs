import java.util.Arrays;
public class Tester
{
    public static void main(String[] args)
    {
        Customer[] list1 = {new Customer("Arthur", 4920),
                new Customer("Burton", 3911),
                new Customer("Burton", 4944),
                new Customer("Franz", 1692),
                new Customer("Horton", 9221),
                new Customer("Jones", 5554),
                new Customer("Miller", 9360),
                new Customer("Nguyen", 4339) };
        Customer[] list2 = {new Customer("Aaron", 1729),
                new Customer("Baker", 2921),
                new Customer("Burton", 3911),
                new Customer("Dillard", 6552),
                new Customer("Jones", 5554),
                new Customer("Miller", 9360),
                new Customer("Noble", 3335) };
        Customer[] result = new Customer[6];
        Arrays.fill(result, null);

        prefixMerge(list1, list2, result);

        for(int i = 0; i < result.length; i++)
        {
            System.out.println(result[i].getName() + " " + result[i].getID());
        }
    }

    // fills result with customers merged from the
    // beginning of list1 and list2;
    // result contains no duplicates and is sorted in
    // ascending order by customer
    // precondition:  result.length > 0;
    //                list1.length >= result.length;
    //                list1 contains no duplicates;
    //                list2.length >= result.length;
    //                list2 contains no duplicates;
    //                list1 and list2 are sorted in
    //                ascending order by customer
    // postcondition: list1, list2 are not modified
    public static void prefixMerge(Customer[] list1,
                                   Customer[] list2,
                                   Customer[] result)
    {
        int num1 = 0;
        int num2 = 0;

        for(int i = 0; i < result.length; i++)
        {
            int compared = list1[num1].compareCustomer(list2[num2]);

            if(compared == 0)
            {
                result[i] = list1[num1];
                num1++;
                num2++;
            }
            else if(compared > 0)
            {
                result[i] = list2[num2];
                num2++;
            }
            else if(compared < 0)
            {
                result[i] = list1[num1];
                num1++;
            }
        }
    }
}
