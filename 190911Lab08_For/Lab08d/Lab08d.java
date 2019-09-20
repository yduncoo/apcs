import java.util.Scanner;
public class Lab08d
{
    public static void main(String[] args)
    {
        Scanner inWord = new Scanner(System.in);
        System.out.print("Word: ");
        String word = inWord.nextLine();
        int lgth = word.length();

        for(int repeat = 0; repeat < lgth; --lgth)
        {
            System.out.println(word.substring(0,lgth));
        }
    }
}