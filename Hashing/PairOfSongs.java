import java.util.HashMap;
import java.util.Map;

public class PairOfSongs {

    public int numPairsDivisibleBy60(int[] nums) {
        int pairCount = 0;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums)
        {
            int remainder = i % 60;
            map.put(remainder, map.getOrDefault(remainder, 0) + 1);
        }



        for (int key : map.keySet())
        {
            if (map.containsKey(60 - key))
            {
                
            }
        }
        return pairCount;
    }
}