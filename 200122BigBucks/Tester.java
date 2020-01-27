import java.io.*;
import java.util.*; //includes ArrayList
import java.text.*; //for NumberFormat
public class Tester
{
    public static void main(String args[])
    {
        NumberFormat formatter = NumberFormat.getNumberInstance( );
        formatter.setMinimumFractionDigits(2);
        formatter.setMaximumFractionDigits(2);
        String name;
        //Instantiate an ArrayList object here called aryList
        do
        {
            Scanner kbReader = new Scanner(System.in);
            System.out.print("Please enter the name to whom the account belongs.
            (\"Exit\" to abort)");
            name = kbReader.nextLine( );

            if( !name.equalsIgnoreCase("EXIT") )
            {
                System.out.print("Please enter the amount of the deposit. ");
                double amount = kbReader.nextDouble();
                System.out.println(" "); //gives an eye-pleasing blank line
                // Create a BankAccount object
                // Add it to the ArrayList object
            }
        }while(!name.equalsIgnoreCase("EXIT"));

        //Search aryList and print out the name and amount of the largest bank account
        BankAccount ba = get first account in the list
        double maxBalance = ba.balance;
        String maxName = ba.name;
        for(int j = 1; j < aryLst.size( ); j++)
        {
            ?
            ? Step through the remaining objects and decide which one has
            largest balance (compare each balance to maxBalance)
            ?
        }
        Print answer
    }
}