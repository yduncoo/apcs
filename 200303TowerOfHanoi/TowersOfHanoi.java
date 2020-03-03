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
            moveOne(fromPost, sparePost);
            moveOne(fromPost, toPost);
            moveOne(sparePost, toPost);
        }
    }

    public static void moveOne(int fromPost, int toPost)
    {
        System.out.println(fromPost + " -- " + toPost);
    }
}