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

        for(int i = 0; i < num.size(); i++)
        {
            System.out.print(num.get(i) + " ");
        }
        System.out.println("");

        // consecutive odds are a curse
        for(int j = 0; j < num.size(); j++)
        {
            if(num.get(j) % 2 != 0)
            {
                num.remove(j);
                
                if(num.get(j) % 2 != 0)
                {
                    num.remove(j);
                }
            }
        }

        for(int k = 0; k < num.size(); k++)
        {
            System.out.print(num.get(k) + " ");
        }
        System.out.println("");
    }
}