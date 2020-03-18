public class MyVehicle extends MyTaxableItem
{
    private double dealerCost;
    private double dealerMarkUp;

    public MyVehicle(double rate, double cost, double markUp)
    {
        super(rate);
        dealerCost = cost;
        dealerMarkUp = markUp;
    }

    public void changeMarkUp(double markUp)
    {
        dealerMarkUp = markUp;
    }

    public double getListPrice()
    {
        return(dealerCost + dealerMarkUp);
    }
}