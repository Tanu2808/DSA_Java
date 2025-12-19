public class MissingPositive {
    public int firstMissingPositive(int[] arr) {
        int i = 0;
        while (i < arr.length)
        {
            int correct = arr[i] - 1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]) swap(arr, i , correct);
            else i++;
        }

        for (i = 0;i < arr.length;i++)
        {
            if (arr[i] != i + 1) return i + 1;
        }

        return arr.length + 1;
    }

    public void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}