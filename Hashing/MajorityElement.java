import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public Map<Integer, Integer> countFrequency(int arr[])
    {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i: arr)
        {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        return map;

    }
    public int majorityElement(int[] nums)
    {
        Map<Integer, Integer> map = countFrequency(nums);
        for (Map.Entry<Integer, Integer> entry: map.entrySet())
        {
            if (entry.getValue() > (nums.length / 2)) return entry.getKey();
        }
        return -1;
    }
}