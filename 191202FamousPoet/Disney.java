public class Disney extends FamousPoet
{
    public Disney()
    {
        super("Walt", "Disney", "The way to get started is to quit talking and begin doing.");
    }
    public void speak()
    {
        System.out.println("\"" + saying.substring(0,33) + ".\" --" + name + " " + lastName);
    }
}