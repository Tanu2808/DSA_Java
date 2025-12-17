public class MissingNum {

    public int missingNumber(int[] arr)
    {
        int i = 0;
        while (i < arr.length)
        {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct])
            {
                int temp = arr[correct];
                arr[correct] = arr[i];
                arr[i] = temp;
            }
            else i++;
        }
        int missing = arr.length;
        for (i = 0;i < arr.length;i++)
        {
            if (arr[i] != i) missing = i;
        }
        return missing;
    }
}