public class MatrixOperations {

    public int[][] addition(int arr1[][],int arr2[][])
    {
        int m = arr1.length;
        int n = arr1[0].length;
        int o = arr2.length;
        int p = arr2[0].length;
        int[][] result = new int[m][n];
        if (m != o || n != p) return null;
        else
        {
            for (int i = 0; i < m; i++)
            {
                for (int j = 0; j < n; j++)
                {
                    result[i][j] = arr1[i][j] + arr2[i][j];              
                }                
            }
        }
        return result;
    }

    public int[][] multiplication(int[][] arr1,int[][] arr2)
    {
        int m = arr1.length;
        int n = arr1[0].length;
        int o = arr2.length;
        int p = arr2[0].length;
        int[][] result = new int[m][p];
        if (n != o) return null;
        else
        {
            for (int i = 0;i < m;i++)
            {
                for (int j = 0;j < p;j++)
                {
                    for (int k = 0; k < n; k++)
                    {
                        result[i][j] += arr1[i][k] * arr2[k][j];
                    }
                }
            }
        }
        return result;
    }

}