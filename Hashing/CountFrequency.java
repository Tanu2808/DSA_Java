import java.util.HashMap;
import java.util.Map;

public class CountFrequency<K> {
    public Map<K, Integer> countFrequency(K arr[])
    {
        Map<K, Integer> map = new HashMap<>();
        for (K i: arr)
        {
            map.put(i, map.getOrDefault(map.get(i) + 1, 0));
        }

        return map;

    }

    public Map<Character, Integer> countFrequency(String str)
    {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++)
        {
            map.put(str.charAt(i), map.getOrDefault(map.get(str.charAt(i)) + 1, 0));
        }
        return map;
    }
}
