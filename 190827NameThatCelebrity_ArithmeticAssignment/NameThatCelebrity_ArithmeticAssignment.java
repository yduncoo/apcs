public class NameThatCelebrity_ArithmeticAssignment
{
    public static void main(String[] args)
    {
        String s1 = "Allan Alda";
        String s2 = "John Wayne";
        String s3 = "Gregory Peck";

        int count1 = s1.length();
        int count2 = s2.length();
        int count3 = s3.length();

        String a1 = s1.substring(2,count1-3);
        String a2 = s2.substring(2,count2-3);
        String a3 = s3.substring(2,count3-3);

        String z = ">>>";
        String y = "\n";

        System.out.println(s1 + z + a1 + y + s2 + z + a2 + y + s3 + z + a3);


        String eq1 = "79 + 3 * (4 + 82 - 68) - 7 + 19 = ";
        String eq2 = "(179 + 21 + 10) / 7 + 181 = "; 
        String eq3 ="10389 * 56 * 11 + 2246 = ";

        int ans1 = 79+3*(4+82-68)-7+19;
        int ans2 = (179+21+10)/7+181;
        int ans3 = 10389*56*11+2246;

        System.out.println(y +eq1 + ans1 + y + eq2 + ans2 + y + eq3 + ans3);
    }
}