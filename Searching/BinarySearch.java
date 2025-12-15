public class BinarySearch {

    // Binary Search using loops
    public int binary(int arr[], int target)
    {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high)
        {
            int mid = (low + high) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] > target) high = mid - 1;
            else low = mid + 1;
        }
        return -1;
    }

    // Binary Search using recursion
    public int binary(int arr[], int target, int low, int high)
    {
        if (low > high) return -1;
        int mid = (low + high) / 2;
        if (arr[mid] == target) return mid;
        else if (arr[mid] > target) binary(arr, target, low, mid - 1);
        else binary(arr, target, mid + 1, high);

        return -1;
    }

}