public class MergeSort {
    
    public void mergeSort(int arr[], int low, int high)
    {
        if (low >= high) return;
        int mid = low + (high - low) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    private void merge(int[] arr, int low, int mid, int high)
    {
        int[] result = new int[high - low + 1];
        int i = 0;
        int left = low, right = mid + 1;
        while (left <= mid && right <= high)
        {
            if (arr[left] <= arr[right])
            {
                result[i] = arr[left];
                left++;
            }
            else
            {
                result[i] = arr[right];
                right++;
            }
            i++;

        }

        while (left <= mid) {
            result[i++] = arr[left++];
        }

        while (right <= high) {
            result[i++] = arr[right++];
        }


        for (i = low; i < result.length; i++)
        {
            arr[i] = result[i];
        }
    }
}
