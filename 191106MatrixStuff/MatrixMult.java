public class MatrixMult
{
    public static int[][] mult(int a[][], int b[][])
    {
        int[][] product = new int[3][2];
        
        for(int row = 0; row < a.length ; row++)
        {
                for(int col = 0; col < b[row].length; col++)
                {
                    int sum = 0;

                    for(int i = 0; i < 4; i++)
                    {
                        sum = sum + (a[row][i] * b[i][col]);
                    }

                    product[row][col] = sum;
                }
        }

        return product;
    }
}