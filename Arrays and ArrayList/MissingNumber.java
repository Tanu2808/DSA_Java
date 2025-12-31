public class MissingNumber {

    public int missingNumber(int arr[])
    {
        int result = 0;
        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] != arr[i - 1] + 1) result = arr[i] - 1;
        }
        return result;

    }
}