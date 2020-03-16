import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MultiKeySort
{
    public static void main(String[] args) throws IOException
    {
        File myfile = new File("Names_ages.txt");
        Scanner filereader = new Scanner(myfile);

        String[] list = new String[11];
        int maxIndex = -1;

        while(filereader.hasNext())
        {
            maxIndex++;
            list[maxIndex] = filereader.nextLine();
            //System.out.println(list[maxIndex]);
        }
        //System.out.println("*" + list.length);
        filereader.close();

        sort(list);

        for(int i = 0; i < list.length; i++)
        {
            System.out.println(list[i]);
        }
        System.out.println(" ");
    }

    public static void sort(String[] list)
    {
        boolean loop;
        do
        {
            loop = false;
            for(int i = 0; i < list.length - 1; i++)
            {
                if(list[i].substring(0, list[i].lastIndexOf(" ")).compareTo(list[i + 1].substring(0, list[i + 1].lastIndexOf(" "))) > 0)
                {
                    String temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                    loop = true;
                }
                else if(list[i].compareTo(list[i + 1]) == 0)
                {
                    if(Integer.parseInt(list[i].substring(list[i].lastIndexOf(" ") + 1)) < Integer.parseInt(list[i + 1].substring(list[i + 1].lastIndexOf(" ") + 1)))
                    {
                        String temp = list[i];
                        list[i] = list[i + 1];
                        list[i + 1] = temp;
                    }
                }
            }
        }
        while(loop);
    }
}