public class BinarySearch2D {

    // Binary Search in 2D row wise and column wise sorted array
    public record Result(int i, int j) {}
    public Result sortedRowColBinary(int[][] arr, int target)
    {
        int row = 0;
        int col = arr[row].length - 1;
        while (row < arr.length && col >= 0)
        {
            if (arr[row][col] == target) return new Result(row, col);
            else if (arr[row][col] > target) col--;
            else row++;
        } 
        return new Result(-1, -1);
    }
    
}