import java.util.*;
public class buldak
{
    public static void main(String[] args)
    {
        ArrayList<Integer> num = new ArrayList<Integer>();

        num.add(5);
        num.add(1);
        num.add(6);
        num.add(8);
        num.add(9);
        num.add(3);
        num.add(2);
        num.add(7);
        num.add(4);

        for(int i = 1; i < num.size(); i++)
        {
            System.out.print(num.get(i) + " ");
            if(!(num.get(i) % 2 == 0))
            {
                num.remove(i);
            }
        }
        System.out.println("");

        for(int i = 1; I< num.size(); i++)
        {
            System.out.print(num.get(i) + " ");
        }
    }
}