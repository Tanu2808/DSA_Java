import java.util.*;
public class TwoSum {
    public Map<Integer, Integer> countFrequency(int[] arr)
    {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++)
        {
            map.put(arr[i] , i);
        }
        return map;
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = countFrequency(nums);

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i]))
            {
                if (map.get(target - nums[i]) != i) return new int [] {map.get(target - nums[i]), i};
            }
        }
        
        return new int[] {-1, -1};
    }
}