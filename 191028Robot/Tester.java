import java.util.Scanner;
public class Tester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Array length: ");
        int lngth = input.nextInt();
        int[] array = new int[lngth];

        for(int i = 0; i < array.length; i++)
        {
            System.out.print("Array number: ");
            array[i] = input.nextInt();
        }

        System.out.print("Start position: ");
        int start = input.nextInt();

        Robot Joo = new Robot(array, start);

        System.out.println(Joo.clearHall());
    }
}