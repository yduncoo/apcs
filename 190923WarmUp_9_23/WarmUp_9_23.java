/* warmup 9/23
    [on the computer] Write a program. Store 4 GPAs in cariables.
    Then check them and print the ones that are less than 2.0.
    And say "good job!" after each.
*/
public class WarmUp_9_23
{
    public static void main(String[] args)
    {
        double[] gpas = {2.6,1.9,3.7,-0.2,18.2,-120};

        for(int i = 0; i < gpas.length; i++)
        {
            if(gpas[i] < 2.0)
            {
                System.out.println(gpas[i] + " good job!");
            }
        }
    }
}