public class Ceiling {
    public int ceiling(int arr[], int target)
    {
        if (target > arr[arr.length - 1]) return -1;
        if (target < arr[0]) return arr[0];
        int low = 0, high = arr.length - 1;
        while (low <= high)
        {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) return arr[mid];
            else if (arr[mid] > target)
            {
                high = mid - 1;
            }
            else low = mid + 1;
        }
        return arr[low];
    }
}
