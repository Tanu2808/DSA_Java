public class Sort {
    public void sort(int[] arr)
    {
        int zero = 0, one = 0, two = 0;
        for (int i = 0;i < arr.length;i++)
        {
            if (arr[i] == 0) zero++;
            if (arr[i] == 1) one++;
            if (arr[i] == 2) two++;
        }
        for (int i = 0;i < arr.length;i++)
        {
            if (zero != 0) 
            {
                arr[i] = 0;
                zero--;
            }
            else if (one != 0)
            {
                arr[i] = 1;
                one--;
            }
            else if (two != 0)
            {
                arr[i] = 2;
                two--;
            }
        }
    }

    public void sortColors(int[] arr)
    {
        int i = 0;
        int j = 0;
        int k = arr.length - 1;
        while (j <= k)
        {
            switch (arr[j]) {
                case 0 -> {
                    swap(arr, i, j);
                    i++;
                    j++;
                }
                case 2 -> {
                    swap(arr, k, j);
                    k--;
                }
                default -> j++;
            }
        }
    }

    public void swap(int[] arr,int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
