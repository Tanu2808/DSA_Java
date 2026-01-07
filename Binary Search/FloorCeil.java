public class FloorCeil {

    public int Floor(int[] arr, int target)
    {
        int low = 0;
        int high = arr.length - 1;
        int floor = arr[low];
        while (low <= high)
        {
            int mid = low + (high - low) / 2;
            if (arr[mid] <= target)
            {
                floor = arr[mid];
                low = mid + 1;
            }
            else high = mid - 1;
        }
        return floor;
    }

    public int Ceil(int[] arr, int target)
    {
        int low = 0;
        int high = arr.length - 1;
        int ceil = arr[high];
        while (low <= high)
        {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= target)
            {
                ceil = arr[mid];
                high = mid - 1;
            }
            else low = mid + 1;
        }
        return ceil;
    }
}