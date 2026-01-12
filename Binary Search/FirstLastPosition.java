public class FirstLastPosition {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        int low = 0;
        int high = nums.length - 1;
        while (low <= high)
        {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target)
            {
                
            }
        }
        return result;
    }
}
