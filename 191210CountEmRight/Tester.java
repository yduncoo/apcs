public class Tester
{
    public static void main(String[] args)
    {
        java.util.Scanner kbin = new java.util.Scanner(System.in);
        String input = "";

        for(;;)
        {
            System.out.print("Type in a sentence and press ENTER. ");

            input = kbin.nextLine();

            input = input.toUpperCase().replaceAll("\\s+","") + "!";
                
            if(input.contains("EXIT"))
            {
                return;
            }

            System.out.println("There are " + (chzeck(input)) + " occurances.\n");
        }
    }

    public static int chzeck(String req)
    {
        String[] sp = req.split("SA");

        return(sp.length - 1);
    }
}