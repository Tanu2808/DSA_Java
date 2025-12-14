public class MaxValue {

    public record Result(int max, int index) {}
    public Result maxElement(int arr[])
    {
        int max = 0;
        int index = 0;
        for (int i = 0;i < arr.length;i++)
        {
            if (arr[i] > max)
            {
                arr[i] = max;
                index = i;
            }
        }
        return new Result(max, index);        
    }
}