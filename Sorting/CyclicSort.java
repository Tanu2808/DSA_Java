public class CyclicSort {

    public void cycle(int[] arr)
    {
        // My Solution for Cycle sort when range is given from 1 - n
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] != (i + 1))
            {
                while (arr[i] != (i + 1))
                {
                    swap(arr, i, arr[i] - 1);

                }
            }
        }
    }

    // Actual Solution
    public void cycleSol(int arr[])
    {
        int i = 0;
        while (i < arr.length)
        {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) swap(arr, i, correct);
            else i++;
        }
    }

    public void swap(int[] arr,int i,int correct)
    {
        int temp = arr[correct];
        arr[correct] = arr[i];
        arr[i] = temp;
    }
}