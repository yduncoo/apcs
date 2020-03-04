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

    /*
    idea for printing: char arraylist, one for each post
    post1 = 3, 2, 1 ; post2 = -, -, - ; post3 = -, -, -

    rewrite moveOne

    char arraylist instance variable for each post

    use fill(postA, "-") for initializing posts 2 and 3
    postX.remove(0) --then--> postY.add(0, prevDisk)
    *make sure to print the char array backwards so that item(0) will be on top
    */
}