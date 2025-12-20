public class InfiniteArray {

    public int binary(int[] arr, int target)
    {
        int low = 0, high = 1;
        while (arr[high] < target)
        {
            low = high + 1;
            high *= 2;
        }
        if (arr[high] == target) return high;
        while (low <= high)
        {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] > target) high = mid - 1;
            else low = mid + 1;
        }
        return -1;
    }
}