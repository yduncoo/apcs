import java.io.*;
import java.util.Scanner;
public class Scaler
{
    public static void main(String[] args) throws IOException
    {
        File myfile = new File(args[0] + ".java");
        Scanner filereader = new Scanner(myfile);

        double percent = Double.parseDouble(args[1]);
        double magnitude = percent / 100;
        String filename = "";
        if(magnitude < 1)
        {
            filename = (args[0] + "R" + ((int)(100 * magnitude)) + ".java"); // R = percent reduced
            System.out.println("Graphic has been reduced by " + ((int)(100 * magnitude)) + "%");
        }
        if(magnitude > 1)
        {
            filename = (args[0] + "M" + ((int)(100 * magnitude)) + ".java"); // M = percent magnified
            System.out.println("Graphic has been magnified by " + ((int)(100 * magnitude)) + "%");
        }
        if(magnitude == 1)
        {
            System.out.println("Graphic at 100% is normal size");
            filereader.close();
            return;
        }

        FileWriter fw = new FileWriter(filename);
        PrintWriter output = new PrintWriter(fw);

        while(filereader.hasNext())
        {
            String line = filereader.nextLine();

            if(line.matches("(.*)" + args[0]))
            {
                if(magnitude < 1)
                {
                    output.println("public class " + args[0] + "R" + ((int)(100 * magnitude)));
                    continue;
                }
                if(magnitude > 1)
                {
                    output.println("public class " + args[0] + "M" + ((int)(100 * magnitude)));
                    continue;
                }
                if(magnitude == 1)
                {
                    output.println("public class " + args[0]);
                    continue;
                }
            }
            if(line.matches("(.*)\\.fill(.*)") || line.matches("(.*)\\.add(.*)") || line.matches("(.*)\\.draw(.*)") || line.matches("(.*)winSize(.*)") || line.matches("(.*)\\.setSize(.*)"))
            {
                if(line.matches("(.*)Arc(.*)"))
                {
                    output.println(arcRescaler(line,magnitude));
                    continue;
                }
                output.println(rescaler(line, magnitude));
                continue;
            }
            if(line.equals(""))
            {
                continue;
            }
            else
            {
                output.println(line);
                continue;
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

        /*for(int i = 0; i < word.length; i++) // word test
        {
            System.out.println("word: " + word[i]);
        }*/

        int[] numI = new int[numS.length];

        for(int i = 0; i < numS.length; i++)
        {
            if(!numS[i].equals(""))
            {
                numI[i] =(int) (Integer.parseInt(numS[i]) * b); //change the two to a magnitude chosen
                // System.out.println("int: " + numS[i]); // number test
            }
        }

        String whole = "";

        int sleep = word.length;
        if(word.length < numI.length)
        {
            sleep = numI.length;
        }

        if(((int)a.charAt(0)) >= 65 && ((int)a.charAt(0)) <= 90 || ((int)a.charAt(0)) >= 97 && ((int)a.charAt(0)) <= 122 || ((int)a.charAt(0) == 32))
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

    public static String arcRescaler(String a, double b)
    {
        String[] numS = a.split("\\D+");

        String[] word = a.split("\\d+");

        /*for(int i = 0; i < word.length; i++) // word test
        {
            System.out.println("word: " + word[i]);
        }*/

        int[] numI = new int[numS.length];

        for(int i = 0; i < numS.length; i++)
        {
            if(!numS[i].equals(""))
            {
                if(i == numS.length - 1)
                {
                    numI[i] =(Integer.parseInt(numS[i]));
                    continue;
                }
                numI[i] =(int) (Integer.parseInt(numS[i]) * b); //change the two to a magnitude chosen
                // System.out.println("int: " + numS[i]); // number test
            }
        }

        String whole = "";

        int sleep = word.length;
        if(word.length < numI.length)
        {
            sleep = numI.length;
        }

        if(((int)a.charAt(0)) >= 65 && ((int)a.charAt(0)) <= 90 || ((int)a.charAt(0)) >= 97 && ((int)a.charAt(0)) <= 122 || ((int)a.charAt(0) == 32))
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