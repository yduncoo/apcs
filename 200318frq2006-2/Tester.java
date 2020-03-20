public class Tester
{
    public static void main(String[] args)
    {
        MyVehicle rx7 = new MyVehicle(0.10, 20000.00, 2500.00);

        System.out.println("rx7 purchase price: $" + rx7.purchasePrice());
        System.out.println("rx7 list price: $" + rx7.getListPrice());

        rx7.changeMarkUp(420.69);

        System.out.println("rx7 new list price: $" + rx7.getListPrice());
        System.out.println("rx7 new purchase price: $" + rx7.purchasePrice());

        MyVehicle s2000 = new MyVehicle(0.10, 20000.00, 1000.00);

        System.out.println("s2000 purchase price: $" + s2000.purchasePrice());
        System.out.println("s2000 list price: $" + s2000.getListPrice());
      
        Vehicle prius = new Vehicle(20000.00, 2500.00, 0.10);

        System.out.println("prius purchase price: $" + prius.purchasePrice());
        System.out.println("prius list price: $" + prius.getListPrice());

        prius.changeMarkUp(420.69);

        System.out.println("prius new list price: $" + prius.getListPrice());
        System.out.println("prius new purchase price: $" + prius.getListPrice());

        Vehicle camry = new Vehicle(20000.00, 1000.00, 0.10);
       
        System.out.println("camry purchase price: $" + camry.purchasePrice());
        System.out.println("camry list price: $" + camry.getListPrice());
    }
}