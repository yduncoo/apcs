public class BankAccount
{
    public double balance;
    public String name;

    public BankAccount(double b, String n)
    {
        balance = b;
        name = n;
    }

    public void deposit(double d)
    {
        balance = balance + d;
    }

    public void withdraw(double w)
    {
        balance = balance - w;
    }
}