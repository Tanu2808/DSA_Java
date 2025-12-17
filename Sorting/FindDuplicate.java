public class FindDuplicate {

    public int findDuplicate(int[] arr) {
        int i = 0;
        while (i < arr.length)
        {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) swap (arr, i ,correct);
            else i++;
        }
        int result = 0;
        for (i = 0;i < arr.length;i++)
        {
            if (arr[i] != (i + 1))
            {
                result = arr[i];
            }
        }

        return result;
        
    }
    public void swap(int[] arr, int i, int correct)
    {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}