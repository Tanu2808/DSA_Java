public class Search2D_Array {

    public record Result(int i,int j) {};
    public Result search(int[][] arr, int target)
    {
        int x = -1, y = -1;
        for (int i = 0;i < arr.length;i++)
        {
            for (int j = 0;j < arr[i].length;j++)
            {
                if (arr[i][j] == target) return new Result(i, j);
            }
        }
        return new Result(x, y);
    }
}