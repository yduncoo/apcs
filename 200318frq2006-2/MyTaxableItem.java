public abstract class MyTaxableItem implements Item
{
    private double taxRate;

    public abstract double getListPrice();

    public MyTaxableItem(double rate)
    {
        taxRate = rate;
    }

    // returns the price of the item including the tax
    public double purchasePrice()
    {
        return(getListPrice() * (1.00 + taxRate));
    }
}