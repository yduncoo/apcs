public class DiskTracker
{
    public static void towersOfHanoi(int numDisks, int fromPost, int sparePost, int toPost)
    {
        if(numDisks == 1)
        {
            moveOne(numDisks, fromPost, toPost);
        }
        else
        {
            towersOfHanoi(numDisks - 1, fromPost, sparePost, toPost);
            moveOne(numDisks, fromPost, toPost);
            towersOfHanoi(numDisks - 1, sparePost, toPost, fromPost);
        }
    }

    public static void moveOne(int numDisks, int fromPost, int toPost)
    {
        System.out.println("[disk " + numDisks + "]" + fromPost + " -- " + toPost);
    }
}