public class RotateMatrix {

    public void transpose(int[][] matrix)
    {
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                if (i < j)
                {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }
    }
    public void rotate(int[][] matrix)
    {
        transpose(matrix);
        for (int i = 0; i < matrix.length; i++)
        {
            int j = 0;
            int k = matrix[i].length - 1;
            while (j < k)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][k];
                matrix[i][k] = temp;
                j++;
                k--;
            }
        }
    }
}