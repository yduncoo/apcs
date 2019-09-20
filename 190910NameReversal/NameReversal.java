import java.util.Scanner;
public class NameReversal
{
    public static void main(String[] args)
    {
        Scanner inName = new Scanner(System.in);
        System.out.print("Please enter your name. ");
        String name = inName.nextLine();
        name = name.toLowerCase();
        int nmLgth = name.length();
        int a = nmLgth - 1, b = nmLgth;

        for(int i = 0; i < nmLgth; ++i)
        {
            System.out.print(name.substring(a,b));
            --a;
            --b;
        }

        System.out.print("\n");
    }
}