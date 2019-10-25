public class Fraction
{
    private int num;
    private int den;

    public int getNum()
    {
        return num;
    }

    public int getDen()
    {
        return den;
    }

    public void setNum(int c)
    {
        num = c;
    }

    public void setDen(int d)
    {
        den = d;
    }

    public Fraction(int a, int b)
    {
        num = a;
        den = b;
    }

    public void horizontal()
    {
        System.out.println(getNum() + " / " + getDen());
    }

    public void vertical()
    {
        System.out.println(getNum() + "\n" + "----" + "\n" + getDen());
    }

    public void reducible()
    {
        int j = getDen();
        if(getDen() > getNum())
        {
            j = getNum();
        }

        for(int i = 2; i <= j; i++)
        {
            if((getNum() % i == 0) && (getDen() % i == 0))
            {
                setNum(getNum()/i);
                setDen(getDen()/i);
                System.out.println("~" + getNum() + "/" + getDen());
                break;
            }
        }
    }
}