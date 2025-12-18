public class MissingAndDuplicate {
    public int[] findErrorNums(int[] arr) {
        int i = 0;
        while (i < arr.length)
        {
            if (arr[i] != arr[arr[i] - 1])
            {
                swap(arr, i, arr[i] - 1);
            }
            else i++;
        }
        int[] result = new int[2];
        for (i = 0;i < arr.length;i++)
        {
            if (arr[i] != i + 1)
            {
                result[0] = arr[i];
                result[1] = i + 1;
            }
        }
        return result;
        
    }

    public void swap(int[] arr, int i, int j)
    {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
