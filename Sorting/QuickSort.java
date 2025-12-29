public class QuickSort {
    public static void quick(int[] arr, int low, int high)
    {
        if (low >= high) return;
        int pivot = arr[low];
        int i = low + 1, j = high;
        while (i <= j)
        {
            if (arr[i] <= pivot) i++;
            else if (arr[j] > pivot) j--;
            else
            {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        swap(arr, low, j);

        quick(arr, low, j - 1);
        quick(arr, j + 1, high);
    }

    private static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
