import java.util.Scanner;
public class Lab08f
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Word: ");
        String word = input.nextLine();
        int lgth = word.length();

        System.out.println(word.substring(0,1));

        System.out.println(word.substring(lgth - 1));
        
        for(; lgth > 0; --lgth)
        {
            System.out.print(word.substring(lgth - 1, lgth));
        }

        System.out.println("\n" + word);
    }
}