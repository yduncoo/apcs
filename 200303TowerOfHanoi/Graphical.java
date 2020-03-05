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
import java.util.ArrayList;
public class Graphical
{
    private int moveCounter;
    private ArrayList<Integer> post1, post2, post3;

    // intializes the first post with all the disks and the first move in Counter
    public Graphical(int numDisks)
    {
        post1 = new ArrayList<Integer>();
        for(int i = 1; i <= numDisks; i++)
        {
            post1.add(i);
        }
        post2 = new ArrayList<Integer>();
        post3 = new ArrayList<Integer>();
        
        moveCounter = 1;
    }
    
    public void towersOfHanoi(int numDisks, int fromPost, int toPost, int sparePost)
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
        // if statements to determine where to move each disk
        if(fromPost == 1 && toPost == 2)
        {
            if(post2.size() > 0)
            {
                post2.add(0, post1.get(0));
            }
            else if(post2.size() == 0)
            {
                post2.add(post1.get(0));
            }
            post1.remove(0);

            printPosts();
        }
        else if(fromPost == 1 && toPost == 3)
        {
            if(post3.size() > 0)
            {
                post3.add(0, post1.get(0));
            }
            else if(post3.size() == 0)
            {
                post3.add(post1.get(0));
            }            
            post1.remove(0);

            printPosts();
        }
        else if(fromPost == 2 && toPost == 1)
        {
            if(post1.size() > 0)
            {
                post1.add(0, post2.get(0));
            }
            else if(post1.size() == 0)
            {
                post1.add(post2.get(0));
            }            
            post2.remove(0);

            printPosts();
        }
        else if(fromPost == 2 && toPost == 3)
        {
            if(post3.size() > 0)
            {
                post3.add(0, post2.get(0));
            }
            else if(post3.size() == 0)
            {
                post3.add(post2.get(0));
            }            
            post2.remove(0);

            printPosts();
        }
        else if(fromPost == 3 && toPost == 1)
        {
            if(post1.size() > 0)
            {
                post1.add(0, post3.get(0));
            }
            else if(post1.size() == 0)
            {
                post1.add(post3.get(0));
            }            
            post3.remove(0);

            printPosts();
        }
        else if(fromPost == 3 && toPost == 2)
        {
            if(post2.size() > 0)
            {
                post2.add(0, post3.get(0));
            }
            else if(post2.size() == 0)
            {
                post2.add(post3.get(0));
            }            
            post3.remove(0);

            printPosts();
        }
        // etc...
    }

    public void printPosts()
    {
        System.out.println("Move " + moveCounter);

        if(post1.size() > 0)
        {
            for(int i = post1.size() - 1; i >= 0; i--)
            {
                System.out.print(post1.get(i));
            }
        }
        System.out.print("--\n");

        if(post2.size() > 0)
        {    
            for(int i = post2.size() - 1; i >= 0; i--)
            {
                System.out.print(post2.get(i));
            }
        }
        System.out.print("--\n");

        if(post3.size() > 0)
        {    
            for(int i = post3.size() - 1; i >= 0; i--)
            {
                System.out.print(post3.get(i));
            }
        }
        System.out.print("--\n\n");

        moveCounter++;
    }
}