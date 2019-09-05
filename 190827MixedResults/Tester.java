public class Tester
{
    public static void main(String[] args)
    {
        double d1 = 37.9;
        double d2 = 1004.128;
        int i1 = 12;
        int i2 = 18;

        double eq1 = 57.2*(i1/i2)+1;
        double eq2 = 57.2*((double)i1/i2)+1;
        double eq3 = 15-i1*(d1*3)+4;
        int eq4 = 15-i1*(int)(d1*3)+4;
        int eq5 = 15-i1*((int)d1*3)+4;

        String prob = "Problem ";

        System.out.println(prob + "1: " + eq1);
        System.out.println(prob + "2: " + eq2);
        System.out.println(prob + "3: " + eq3);
        System.out.println(prob + "4: " + eq4);
        System.out.println(prob + "5: " + eq5);
    }
}