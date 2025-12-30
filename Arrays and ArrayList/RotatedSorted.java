public class RotatedSorted {

    public boolean check(int[] nums) {
        switch (rotationCount(nums)) {
            case 0 -> 
            {
                return true;
            }
            case 1 ->
            {
                return nums[0] >= nums[nums.length - 1];
            }
            default -> 
            {
                return false;
            }
        }
    }

    private int rotationCount(int[] nums) {
        int rotations = 0;
        for (int i = 1;i < nums.length;i++)
        {
            if (nums[i] < nums[i - 1]) rotations++;
        }
        return rotations;
    }
}