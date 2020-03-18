public class Vehicle extends TaxableItem
{
    private double dealerCost;
    private double dealerMarkUp;

    public Vehicle(double cost, double markup, double rate)
    {
        super(rate);
        dealerCost = cost;
        dealerMarkUp = markup;
    }

    public void changeMarkUp(double newMarkup)
    {
        dealerMarkUp = newMarkup;
    }

    public double getListPrice()
    {
        return dealerCost + dealerMarkUp;
    }
}