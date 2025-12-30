
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {

    public int[] removeDuplicates(int[] arr)
    {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) if (!list.contains(arr[i])) list.add(arr[i]);
        int[] set = new int[list.size()];
        for (int i = 0; i < set.length; i++) set[i] = list.get(i);
        return set;
    }

    // if array is sorted

    public int[] removeDuplicate(int[] arr)
    {
        int j = 1;
        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] != arr[i - 1])
            {
                arr[j++] = arr[i];
            }
        }
        return Arrays.copyOf(arr, j);
    }
}