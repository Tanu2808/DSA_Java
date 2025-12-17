import java.util.ArrayList;
import java.util.List;

public class AllDuplicates {

    public List<Integer> findDuplicates(int[] arr) {
        int i = 0;
        while (i < arr.length)
        {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) swap (arr, i ,correct);
            else i++;
        }
        List<Integer> result = new ArrayList<>();
        for (i = 0;i < arr.length;i++)
        {
            if (arr[i] != (i + 1)) result.add(arr[i]);
        }

        return result;
        
    }
    public void swap(int[] arr, int i, int correct)
    {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}