import java.util.HashSet;
import java.util.Set;

public class SetMatrix {

    public void setZeroes(int[][] matrix) {
        Set<Integer> rows = new HashSet<>();
        Set<Integer> columns = new HashSet<>();
        for (int i = 0; i < matrix.length; i++) 
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                if (matrix[i][j] == 0)
                {
                    rows.add(i);
                    columns.add(j);
                }
            }
        }

        for (int i : rows)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                matrix[i][j] = 0;
            }
        }

        for (int[] i : matrix)
        {
            for (int j : columns)
            {
                i[j] = 0;
            }
        }
    }
}