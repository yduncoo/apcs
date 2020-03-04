/*
    idea for printing: char arraylist, one for each post
    post1 = 3, 2, 1 ; post2 = -, -, - ; post3 = -, -, -

    rewrite moveOne

    char arraylist instance variable for each post

    use fill(postA, "-") for initializing posts 2 and 3
    postY.add(0, postX.get(0)) --then--> postX.remove(0)
    *make sure to print the char array backwards so that item(0) will be on top
*/

// how do i initialize post one with the total amount of disks
// how to initialize moveCounter = 1
public class Graphical
{
    private int totalDisks;
    private int moveCounter;
    private ArrayList<String> post1, post2, post3;

    public Graphical(int numDisks)
    {
        for(int i = numDisks; i > 0; i--)
        {
            post1.add(0, i);
        }
        moveCounter = 1;
    }
    public void towersOfHanoi(int numDisks, int fromPost, int sparePost, int toPost)
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

    private void moveOne(int fromPost, int toPost)
    {
        tracker(fromPost, toPost); // prints out all towers graphically
    }

    // intializes the first post with all the disks
    public void setPost(ArrayList<String> post, int length)
    {
        for(int i = 0; i < length; i++)
        {
            post.add(i, i + 1);
        }
    }

    public void printPosts()
    {
        System.out.println("Move " + moveCounter);
        //System.out.println(post1 + "--");
        for(int i = post1.size() - 1; i > 0; i--)
        {
            System.out.print(post1.get(i));
        }
        System.out.print("--\n");
        //System.out.println(post2 + "--");
        for(int i = post2.size() - 1; i > 0; i--)
        {
            System.out.print(post2.get(i));
        }
        System.out.print("--\n");
        //System.out.println(post3 + "--");
        for(int i = post3.size() - 1; i > 0; i--)
        {
            System.out.print(post3.get(i));
        }
        System.out.print("--\n\n");

        moveCounter++;
    }

    public void tracker(int fromPost, int toPost)
    {
        // if statements to determine where to move each disk
        if(fromPost == 1 && toPost == 2)
        {
            post2.add(0, post1.get(0));
            post1.remove(0);

            printPosts();
        }
        else if(fromPost == 1 && toPost == 3)
        {
            post3.add(0, post1.get(0));
            post1.remove(0);

            printPost();
        }
        else if(fromPost == 2 && toPost == 1)
        {
            post3.add(0, post1.get(0));
            post1.remove(0);

            printPost();
        }
        else if(fromPost == 2 && toPost == 3)
        {
            post3.add(0, post1.get(0));
            post1.remove(0);

            printPost();
        }
        else if(fromPost == 3 && toPost == 1)
        {
            post3.add(0, post1.get(0));
            post1.remove(0);

            printPost();
        }
        else if(fromPost == 3 && toPost == 2)
        {
            post3.add(0, post1.get(0));
            post1.remove(0);

            printPost();
        }
        // etc...
    }
}