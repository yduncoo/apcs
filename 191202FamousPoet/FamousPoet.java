public class FamousPoet
{
    public String name;
    public String lastName;
    protected String saying;

    public FamousPoet(String first, String last, String say)
    {
        name = first;
        lastName = last;
        saying = say;
    }

    public FamousPoet()
    {
        name = "First Name";
        lastName = "Last Name";
        saying = "Quote";
    }

    public void speak()
    {
        System.out.println("\"" + saying + "\"--" + name + " " + lastName);
    }
}