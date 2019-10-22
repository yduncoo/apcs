import java.util.Scanner;
public class Tester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter full name: ");

        String accName = input.nextLine();

        BankAccount myAccount = new BankAccount(0,accName);

        System.out.println("What would you like to do?");
        System.out.println("Deposit \nWithdraw \nBalance");
        
        String choice = input.nextLine();

        if(choice.equals("Deposit"))
        {
            System.out.println("Deposit amount: ");
            myAccount.setDeposit(input.nextDouble());
            System.out.println("The " + myAccount.getName() + " account balance is, $" + myAccount.getBalance());
        }

        if(choice.equals("Withdraw"))
        {
            System.out.println("Withdraw amount: ");
            myAccount.setWithdraw(input.nextDouble());
            System.out.println("The " + myAccount.getName() + " account balance is, $" + myAccount.getBalance());
        }

        if(choice.equals("Balance"))
        {
            System.out.println("The " + myAccount.getName() + " account balance is, $" + myAccount.getBalance());
        }
    }
}