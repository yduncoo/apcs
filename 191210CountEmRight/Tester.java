public class Tester
{
    public static void main(String[] args)
    {
        java.util.Scanner kbin = new java.util.Scanner(System.in);
        String input = "";

        while(input != "EXIT")
        {
            System.out.print("Type in a sentence and press ENTER. ");

            input = kbin.nextLine();

            input = input.toUpperCase();

            System.out.println(input);

            String[] sp = input.split("SA");

            System.out.println("There are " + (sp.length - 1) + " occurances.");
        }
    }
}