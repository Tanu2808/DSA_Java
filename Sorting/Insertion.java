public class Insertion {

    public void insertion(int[] arr)
    {
        for (int i = 0;i < arr.length - 1;i++)
        {
            int j = i + 1;
            int key = arr[j];
            while (j > 0 && key < arr[j - 1])
            {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = key;
        }
    }
}