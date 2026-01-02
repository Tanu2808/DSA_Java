public class MaximumSubarray {

    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum > max) max = sum;
            if (sum < 0) sum = 0;
        }
        return max;
    }

    public int[] printMaxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int j = 0, k = 0;
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum > max) 
            {
                max = sum;
                j = temp;
                k = i;
            }
            if (sum < 0) {
                sum = 0;
                j = i + 1;
                k = j;
            }
        }

        int[] result = new int[k - j + 1];
        int x = 0;
        for (int i = j; i <= k; i++) {
            result[x++] = nums[i];
        }
        return result;
    }
}