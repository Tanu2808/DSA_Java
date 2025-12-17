import java.util.ArrayList;
import java.util.List;

public class FindMissingNums
{
    public List<Integer> findDisappearedNumbers(int[] arr)
    {
        int i = 0;
        while (i < arr.length)
        {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) swap (arr, i ,correct);
            else i++;
        }

        List<Integer> list = new ArrayList<>();
        for (i = 0;i < arr.length;i++)
        {
            if (arr[i] != (i + 1)) list.add(i + 1);
        }

        return list;
    }
    public void swap(int[] arr, int i, int correct)
    {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}