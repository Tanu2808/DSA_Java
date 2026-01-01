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
}
