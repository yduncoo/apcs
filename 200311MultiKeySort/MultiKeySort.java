import java.io.*;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class MultiKeySort
{
    public static void main(String[] args) throws IOException
    {
        File myfile = new File("Names_ages.txt");
        Scanner filereader = new Scanner(myfile);

        FileInputStream fileStream = new FileInputStream(myfile);
        InputStreamReader input = new InputStreamReader(fileStream);
        BufferedReader reader = new BufferedReader(input);
        
        int lines = 0;
        while(reader.readLine() != null)
        {
            lines++;
        }
        reader.close();

        int maxIndex = -1;
        String[] list = new String[lines];

        while(filereader.hasNext())
        {
            maxIndex++;
            list[maxIndex] = filereader.nextLine();
            // System.out.println(list[maxIndex]);
        }
        // System.out.println("*" + list.length);
        filereader.close();

        sort(list);

        System.out.println(" ");
        for(int i = 0; i < list.length; i++)
        {
            System.out.println(list[i].substring(0, list[i].lastIndexOf(" ")) + "," + list[i].substring(list[i].lastIndexOf(" ")));
        }
        System.out.println(" ");
    }

    public static void sort(String[] list)
    {
        int min;
        for(int i = 0; i < list.length; i++)
        {
            min = i;
            for(int j = i + 1; j < list.length; j++) // double sort loop
            {
                int comparison = (list[j].substring(0, list[j].lastIndexOf(" "))).compareTo(list[min].substring(0, list[min].lastIndexOf(" ")));
                
                if(comparison < 0) // name2 bigger than name1 -> set name1 to name2
                {
                    min = j;
                }
                else if(comparison == 0) // name the same -> compare numbers
                {
                    if(Integer.parseInt(list[j].substring(list[j].lastIndexOf(" ") + 1)) < Integer.parseInt(list[min].substring(list[min].lastIndexOf(" ") + 1)))
                    {
                        min = j;
                    }
                }
            }
            // bubble sort
            String temp = list[min];
            list[min] = list[i];
            list[i] = temp;
        }
    }
}