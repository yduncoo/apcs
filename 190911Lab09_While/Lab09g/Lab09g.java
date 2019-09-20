import java.util.Scanner;
public class Lab09g
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Remove from: ");
        String sent = input.nextLine();

        System.out.print("Remove: ");
        String str = input.nextLine();

        int remove = sent.indexOf(str);

        int lgth = str.length();

        while(remove >= 0)
        {
            sent = ((sent.substring(0,(remove - 1))) + sent.substring(remove + lgth));
            remove = sent.indexOf(str);
        }

        System.out.println(sent);
    }
}