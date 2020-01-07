import java.io.*;
import java.util.Scanner;
public class Scaler
{
    public static void main(String[] args) throws IOException
    {
        File myfile = new File(args[0] + ".java");
        Scanner filereader = new Scanner(myfile);

        java.util.Scanner kbin = new java.util.Scanner(System.in);
        System.out.print("Scale by what percent: ");
        double magnitude = kbin.nextInt() / 100;

        FileWriter fw = new FileWriter(args[0] + "x" + (int)magnitude + ".java"); //change # to have magnitude altered
        PrintWriter output = new PrintWriter(fw);

        while(filereader.hasNext())
        {
            String line = filereader.nextLine();

            if(line.matches(args[0]))
            {
                output.println("public class " + args[0] + "x" + (int)magnitude);
            }
            
            if(line.matches("(.*)fill(.*)") || line.matches("(.*)add(.*)") || line.matches("(.*)draw(.*)") || line.matches("(.*)size(.*)"))
            {
                output.println(rescaler(line, magnitude));
            }
            else
            {
                output.println(line);
            }
        }

        output.close();
        fw.close();
        filereader.close();
    }

    public static String rescaler(String a, double b)
    {
        String[] numS = a.split("\\D+");

        String[] word = a.split("\\d+");

        int[] numI = new int[numS.length];

        for(int i = 0; i < numS.length; i++)
        {
            if(!numS[i].equals(""))
            {
                numI[i] =(int) (Integer.parseInt(numS[i]) * b); //change the two to a magnitude chosen
            }
        }

        String whole = "";

        int sleep = word.length;
        if(word.length < numI.length)
        {
            sleep = numI.length;
        }

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
            }
        }

        if(((int)a.charAt(0) >= 48) && ((int)a.charAt(0) <= 57))
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
            }
        }

        return whole;
    }
}