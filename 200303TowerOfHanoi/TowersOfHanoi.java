public class TowersOfHanoi
{
    public static void towersOfHanoi(int numDisks, int fromPost, int sparePost, int toPost)
    {
        if(numDisks == 1)
        {
            moveOne(fromPost, toPost);
        }
        else
        {
            towersOfHanoi(numDisks - 1, fromPost, sparePost, toPost);
            moveOne(fromPost, toPost);
            towersOfHanoi(numDisks - 1, sparePost, toPost, fromPost);
        }
    }

    public static void moveOne(int fromPost, int toPost)
    {
        System.out.println(fromPost + " -- " + toPost);
    }

    //idea for printing: char arrays, one for each column
}