public class BankAccount
{
    private double balance;
    private String name;

    public String getName()
    {
        return name;
    }

    public double getBalance()
    {
        return balance;
    }

    public BankAccount(double b, String n)
    {
        balance = b;
        name = n;
    }

    public void setDeposit(double d)
    {
        balance = balance + d;
    }

    public void setWithdraw(double w)
    {
        balance = balance - w;
    }
}