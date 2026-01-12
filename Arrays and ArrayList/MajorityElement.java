import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElement {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>(2);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if (map.get(nums[i]) > nums.length / 3 && !list.contains(nums[i])) list.add(nums[i]);
        }
        return list;
    }
}
