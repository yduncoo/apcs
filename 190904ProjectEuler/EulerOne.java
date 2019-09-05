public class EulerOne
{
    public static void main(String[] args)
    {
        int thousand = 1;
        int result = 0;
        while(thousand<1000)
        {
            int three = thousand%3;
            int five = thousand%5;

            if(three==0)
            {
                result = result + thousand;
                System.out.println(result);
            }
            else if(five==0)
            {
                result = result + thousand;
                System.out.println(result);
            }

            thousand++;
        }
    }
}