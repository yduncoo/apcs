import java.io.*;
import java.util.Scanner;
public class Tester
{
    public static void main(String[] args) throws IOException
    {
        //Scanner kbin = new Scanner(System.in);
        File myfile = new File(args[0] + ".txt");
        Scanner filereader = new Scanner(myfile);

        FileWriter fw = new FileWriter(args[0] + "x2.txt");
        PrintWriter output = new PrintWriter(fw);

        //try { Scanner filereader = new Scanner(myfile); }
        //catch(IOException e) { System.out.println("File not found error!"); }

        while (filereader.hasNext())
        {
            String line = filereader.nextLine();
            output.println(dbl(line));
        }

        output.close();
        fw.close();
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

        // number check
        /*for(int i = 0; i < numS.length; i++)
        {
            System.out.println(i + "~" + numS[i]);
        }*/

        String[] word = a.split("\\d+"); // logging all the places where the numbers were

        int[] numI = new int[numS.length]; // number converted from string to int

        // logs each integer in the sentence as an actual int to double the value
        for(int i = 0; i < numS.length; i++)
        {
            if(!numS[i].equals(""))
            {
                numI[i] = Integer.parseInt(numS[i]) * 2;
            }
        }

        String whole = ""; // this will reconstruct the sentence

        int sleep = word.length;
        if(word.length < numI.length)
        {
            sleep = numI.length;
        }

        // figure out how to check length
        if(((int)a.charAt(0)) >= 65 && ((int)a.charAt(0)) <= 90 || ((int)a.charAt(0)) >= 97 && ((int)a.charAt(0)) <= 122)
        {
            for(int i = 0; i < sleep; i++)
            {
                if(i < numI.length && !numS[i].equals(""))
                {
                    whole = whole + numI[i];
                }

                if(i < word.length && !word[i].equals(""))
                {
                    whole = whole + word[i];
                }

                //System.out.println(i + "~ " + whole); // sequencing testing
            }
        }

        if((((int)a.charAt(0)) >= 48) && (((int)a.charAt(0)) <= 57))
        {
            for(int i = 0; i < sleep; i++)
            {
                if(i < word.length && !word[i].equals(""))
                {
                    whole = whole + word[i];
                }

                if(i < numI.length && !numS[i].equals(""))
                {
                    whole = whole + numI[i];
                }

                //System.out.println(i + "!~ " + whole); // sequencing testing
            }
        }

        return whole;
    }
}