public class ReversArray {

    public static void swap(int[] arr,int i,int j)
    {
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }

    public static void reverse(int[] arr)
    {
        int i = 0;
        int j = arr.length - 1;

        while(i >= j)
        {
            swap(arr, i, j);
            i++;
            j--;
        }

    }
}