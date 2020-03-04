public class TowersOfHanoi
{
    public static void towersOfHanoi(int numDisks, int fromPost, int toPost, int sparePost)
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
        System.out.println(fromPost + " --> " + toPost);
    }
}