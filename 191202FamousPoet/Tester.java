public class Tester
{
    public static void main(String[] args)
    {
        FamousPoet quote[] = new FamousPoet[4];
        quote[0] = new Napoleon();
        quote[1] = new Disney();
        quote[2] = new Steve();
        quote[3] = new Wankel();

        for(int i = 0; i < quote.length; i++)
        {
            quote[i].speak();
        }
    }
}