import java.util.Arrays;

public class Leader {

    public int[] leaders(int[] arr)
    {
        int max = Integer.MIN_VALUE;
        int[] result = new int[arr.length];
        int count = 0;
        for (int i = arr.length - 1; i >= 0; i--)
        {
            if (arr[i] > max)
            {
                max = arr[i];
                result[count++] = arr[i];
            }
        }
        return Arrays.copyOf(result, count + 1);
    }
}