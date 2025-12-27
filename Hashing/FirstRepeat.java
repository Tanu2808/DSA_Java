
import java.util.HashMap;
import java.util.Map;

public class FirstRepeat<K> {

    public int firstRepeatingElement(int[] arr)
    {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr)
        {
            map.put(i, map.getOrDefault(i, 0) + 1);
            if (map.get(i) > 1) return i;
        }
        return -1;
    }
}