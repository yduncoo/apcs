public class EulerSix
{
    public static void main(String[] args)
    {
        int thousand = 0;
        int sumSeperate = 0;
        int sumTotal = 0;

        while(thousand<=100)
        {
            sumSeperate = (thousand*thousand) + sumSeperate;
            //System.out.println(sumSeperate); //Testing of sumSeperate

            sumTotal = sumTotal + thousand;
            //System.out.println(sumTotal); //Testing of sumTotal

            thousand++;
        }

        System.out.println((sumTotal*sumTotal) - sumSeperate);
    }
}