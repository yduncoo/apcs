public class EulerTwo
{
    public static void main(String[] args)
    {
        int oldFib = 1;
        int newFib = 0;
        int result = 0;

        while(newFib<=4000000)
        {
            newFib = oldFib + newFib;
            oldFib = newFib - oldFib; //these two lines of code took way to long. esp since i had no idea what fib seq was
            
            int even = newFib%2;
            
            if(even==0)
            {
                result = result + newFib;
                System.out.println(result);
            }
        }
    }
}