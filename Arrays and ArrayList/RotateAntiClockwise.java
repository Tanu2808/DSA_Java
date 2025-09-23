public class RotateAntiClockwise
{
    static void reverse(int arr[], int start, int end)
    {
        while (start < end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static void rotateArr(int arr[], int d) {
        
        d %= arr.length;
        // add your code here
        reverse(arr, 0, d - 1);
        
        reverse(arr, d, arr.length - 1);
        
        reverse(arr, 0, arr.length - 1);
    }
}