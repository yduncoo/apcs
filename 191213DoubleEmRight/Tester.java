import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Tester
{
    public static void main(String[] args) throws IOException
    {
        //Scanner kbin = new Scanner(System.in);
        File myfile = new File("README.TXT");
        Scanner filereader = new Scanner(myfile);;

        //try { Scanner filereader = new Scanner(myfile); }
        //catch(IOException e) { System.out.println("File not found error!"); }

        while (filereader.hasNext())
        {
            String line = filereader.nextLine();
            System.out.println(dbl(line));
        }

        filereader.close();

        /*for(;;)
        {
            System.out.print("Type in a sentence and press ENTER: ");
            
            input = kbin.nextLine();

            input = input + "!";

            if(input.contains("EXIT"))
            {
                return;
            }

            System.out.println(dbl(input));
        }*/
    }

    public static String dbl(String a)
    {
        String[] numS = a.split("\\D+"); // number int string

        String[] word = a.split("\\d+"); // logging all the places where the numbers were

        int[] numI = new int[numS.length]; // number converted from string to int

        // logs each integer in the sentence as an actual int to double
        for(int i = 0; i < numS.length; i++)
        {
            numI[i] = Integer.parseInt(numS[i]) * 2;
        }

        String whole = ""; // this will reconstruct the sentence

        // figure out how to check length
        if((((int)a.charAt(0)) >= 64) && (((int)a.charAt(0)) <= 90))
        {
            for(int i = 0; i < word.length; i++)
            {
                if(numI.length - 1 > i)
                {
                    whole = whole + numI[i];
                }

                whole = whole + word[i]; 
            }
        }

        if((((int)a.charAt(0)) >= 48) && (((int)a.charAt(0)) <= 57))
        {
            for(int i = 0; i < numI.length; i++)
            {
                if(word.length - 1 > i)
                {
                    whole = whole + word[i];
                }

                whole = whole + numI[i];
            }
        }

        return whole;
    }
}