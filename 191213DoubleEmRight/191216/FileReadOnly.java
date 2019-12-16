import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileReadOnly
{
    public static void main (String[] args) throws IOException
    {
        File myfile = new File("README.TXT");
        Scanner filereader = new Scanner(myfile);;
        
        //try { Scanner filereader = new Scanner(myfile); }
        //catch(IOException e) { System.out.println("File not found error!"); }
        
        while (filereader.hasNext())
        {
            String line = filereader.nextLine();
            System.out.println(line);
        } 

        filereader.close();
    }
}