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

    public K mostFrequent(K arr[])
    {
        Map<K, Integer> map = countFrequency(arr);
        K mostFreq = null;
        int freq = Integer.MIN_VALUE;
        for (Map.Entry<K, Integer> entry: map.entrySet())
        {
            if (entry.getValue() > freq) {
                freq = entry.getValue();
                mostFreq = entry.getKey();
            }
        }
        return mostFreq;
    }

    public K leastFrequent(K arr[])
    {
        Map<K, Integer> map = countFrequency(arr);
        K leastFreq = null;
        int freq = Integer.MAX_VALUE;
        for (Map.Entry<K, Integer> entry: map.entrySet())
        {
            if (entry.getValue() > freq) {
                freq = entry.getValue();
                leastFreq = entry.getKey();
            }
        }
        return leastFreq;
    }
}
