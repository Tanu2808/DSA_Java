public class ElementRange {

    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        
        int low = 0, high = nums.length - 1;
        if (nums.length == 0 || target < nums[0] || target > nums[high]) return result;
        while (low <= high)
        {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target)
            {
                if (mid == 0 || nums[mid - 1] != target)
                {
                    result[0] = mid;
                    break;
                }
                else high = mid - 1;
            }
            else if (nums[mid] > target) high = mid - 1;
            else low = mid + 1;
        }
        low = 0;
        high = nums.length - 1;
        while (low <= high)
        {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target)
            {
                if (mid == nums.length - 1 || nums[mid + 1] != target)
                {
                    result[1] = mid;
                    break;
                }
                else low = mid + 1;
            }
            else if (nums[mid] > target) high = mid - 1;
            else low = mid + 1;
        }

        return result;
        
    }
}