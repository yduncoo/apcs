import java.util.Scanner;
public class Lab09f
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Remove from: ");
        String sent = input.nextLine();
        
        System.out.print("Letter to be remove: ");
        String lttr = input.nextLine();

        int remove = sent.indexOf(lttr);

        while(remove >= 0)
        {
            sent = ((sent.substring(0,remove)) + (sent.substring(remove+1)));
            remove = sent.indexOf(lttr);
        }

        System.out.println(sent);
    }
}