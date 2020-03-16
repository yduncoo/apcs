import java.io.IOException;

public class MultiKeySort
{
    public static void main(String[] args) throws IOException
    {
        File myfile = new File("Names_ages.txt");
        Scanner filereader = new Scanner(myfile);

        String[] list = new String[1000];
        int maxIndex = -1;

        while(filereader.hasNext())
        {
            maxIndex++;
            text[maxIndex] = filereader.nextLine();
            System.out.println(text[maxIndex]);
        }
        filereader.close();
    }
}