public class OrderAgnosticBinary {

    public int binary(int arr[], int target)
    {
        int low = 0;
        int high = arr.length - 1;
        if (arr[low] < arr[high])
        {
            while (low <= high)
            {
                int mid = (low + high) / 2;
                if (arr[mid] == target) return mid;
                else if (arr[mid] > target) high = mid - 1;
                else low = mid + 1;
            }
            return -1;
        }
        else
        {
            while (low <= high)
            {
                int mid = (low + high) / 2;
                if (arr[mid] == target) return mid;
                else if (arr[mid] > target) low = mid + 1;
                else high = mid - 1;
            }
            return -1;
        }
    }
}