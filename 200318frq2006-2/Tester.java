public class Tester
{
    public static void main(String[] args)
    {
        MyVehicle rx7 = new MyVehicle(0.10, 20000.00, 2500.00);
        MyVehicle s2000 = new MyVehicle(0.10, 20000.00, 1000.00);

        System.out.println(rx7.purchasePrice());
        System.out.println(s2000.purchasePrice());

        Vehicle prius = new Vehicle(20000.00, 2500.00, 0.10);
        Vehicle camry = new Vehicle(20000.00, 1000.00, 0.10);

        System.out.println(prius.purchasePrice());
        System.out.println(camry.purchasePrice());
    }
}