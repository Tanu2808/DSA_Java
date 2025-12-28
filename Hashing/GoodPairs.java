
import java.util.HashMap;
import java.util.Map;

public class GoodPairs {

    public int numIdenticalPairs(int[] nums) {
        int pairCount = 0;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0;i < nums.length;i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for (int key : map.keySet())
        {
            int count = map.get(key);
            while (count > 1)
            {
                pairCount += (count - 1);
                count -= 1;
            }
        }
        return pairCount;
    }
}