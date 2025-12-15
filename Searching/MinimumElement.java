public class MinimumElement {

    public record Result(int result, int index) {}
    public Result minimumElement(int arr[])
    {
        int result = arr[0];
        int index = 0;
        for (int i = 0;i < arr.length;i++) 
        {
            if (arr[i] < result) 
            {
                result = arr[i];
                index = i;
            }
        }
        return new Result(result, index);
    }
}