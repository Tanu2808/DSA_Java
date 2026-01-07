public class Bound {

    public int lowerBound(int[] nums, int target)
    {
        int low = 0;
        int high = nums.length;
        if (nums[high - 1] < target) return high;
        while (low < high)
        {
            int mid = low + (high - low) / 2;
            if (nums[mid] >= target) high = mid;
            else low = mid + 1;
        }
        return low;
    }

    public int upperBound(int[] nums, int target)
    {
        int low = 0;
        int high = nums.length;
        if (nums[high - 1] < target) return high;
        while (low < high)
        {
            int mid = low + (high - low) / 2;
            if (nums[mid] > target) high = mid;
            else low = mid + 1;
        }
        return high;
    }
}