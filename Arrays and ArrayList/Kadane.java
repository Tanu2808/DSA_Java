public class Kadane {
    int maxSubarraySum(int[] arr) {
        // Code here
        int maxEnd = arr[0];
        int result = arr[0];
        for (int i = 0;i < arr.length;i++)
        {
            maxEnd = Math.max(maxEnd + arr[i], arr[i]);
            result = Math.max(result, maxEnd);
            
        }
        return result;
    }
}
