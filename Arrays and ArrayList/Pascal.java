
import java.util.ArrayList;
import java.util.List;

public class Pascal {
    public int factorial(int num)
    {
        int result = 1;
        for (int i = 1; i <= num; i++) result *= i;
        return result;
    }
    public int findElement(int row, int col)
    {
        int i = row - 1, j = col - 1;
        int numerator = 1;
        int denominator = 1;
        while (j >= 1)
        {
            numerator *= (i--);
            denominator *= (j--);
        }
        int result = numerator / denominator;
        // int result = factorial(row - 1) / (factorial(col - 1) * factorial(row - col));
        return result;
    }

    public List<Integer> nthRow(int row)
    {
        List<Integer> result = new ArrayList<>(row);
        int element = 1;
        for (int col = 1; col <= row; col++)
        {
            result.add(element);
            element = element * (row - col) / col;
        }
        return result;
    }

    public List<List<Integer>> generate(int rows)
    {
        List<List<Integer>> list = new ArrayList<>(rows);
        for (int i = 1; i <= rows; i++)
        {
            list.add(nthRow(i));
        }
        return list;
    }


}
