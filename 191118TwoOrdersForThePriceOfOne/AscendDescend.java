public class AscendDescend
{
    public static void main(String[] args)
    {
        String[] ss ={"Bill", "Mary", "Lee", "Agnes", "Alfred", "Thomas", "Alvin", "Bernard", "Ezra", "Herman"};
        java.util.Arrays.sort(ss);

        System.out.println("Ascend    Descend \n");
        for(int i = 0; i < ss.length; i++)
        {
            String spacing = "";
            switch(ss[i].length())
            {
                case 3:
                    spacing = "       ";
                    break;
                case 4:
                    spacing = "      ";
                    break;
                case 5:
                    spacing = "     ";
                    break;
                case 6:
                    spacing = "    ";
                    break;
                case 7:
                    spacing = "   ";
            }
            System.out.println(ss[i] + spacing + ss[ss.length - i - 1]);

        }
    }
}