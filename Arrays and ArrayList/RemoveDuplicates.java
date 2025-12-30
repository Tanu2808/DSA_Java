
import java.util.ArrayList;
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
    
}