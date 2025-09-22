import java.util.ArrayList;

public class RemoveDuplicates
{
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        int idx = 1;
        
        for (int i = 1;i < arr.length;i++)
        {
            if (arr[i] != arr[i - 1])
            {
                arr[idx++] = arr[i];
            }
        }
        for (int i = 0;i < idx;i++)
        {
            result.add(arr[i]);
        }
        return result;
    }
}