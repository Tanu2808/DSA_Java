public class Floor {

    public int floor(int arr[], int target)
    {
        if (target > arr[arr.length - 1]) return arr[arr.length - 1];
        if (target < arr[0]) return -1;

        int low = 0, high = arr.length - 1;
        while (low <= high)
        {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) return arr[mid];
            else if (arr[mid] < target)
            {
                low = mid + 1;
            }
            else high = mid - 1;
        }
        return arr[high];
    }
}