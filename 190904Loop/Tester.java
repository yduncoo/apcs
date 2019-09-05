public class Tester
{
    public static void main(String[] args)
    {
        int count = 0;

        while(count<29999)
        {
            System.out.print("ฅ^•ﻌ•^ฅ                    ");

            try
            {
                Thread.sleep(20);
            }
            catch (InterruptedException e)
            {}

            count++;
        }
    }
}