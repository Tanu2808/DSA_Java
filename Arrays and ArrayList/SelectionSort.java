public class SelectionSort
{
    public static int[] selection(int arr[])
    {
        for (int i = 0;i < arr.length - 1;i++)
        {
            int minIDX = i;
            for (int j = i + 1;j < arr.length;j++)
            {
                if (arr[minIDX] > arr[j]) minIDX = j;
            }
            int temp = arr[minIDX];
            arr[minIDX] = arr[i];
            arr[i] = temp; 
        }

        return arr;
    }
}