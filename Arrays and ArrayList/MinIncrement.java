public class MinIncrement
{
    static int minOps(int arr[], int k) {

        // Your code here
        int result = 0;
        int max = arr[0];
        for (int i = 1;i < arr.length;i++)
        {
            if (arr[i] > max) max = arr[i];
        }
        for (int i = 0;i < arr.length;i++)
        {
            if ((max - arr[i]) % k != 0) return -1;
            else result += ((max - arr[i]) / k);
        }
        
        return result;
    }
}