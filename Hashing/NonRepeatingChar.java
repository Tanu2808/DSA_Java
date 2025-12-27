
import java.util.HashMap;
import java.util.Map;

public class NonRepeatingChar {

     public char nonRepeatingChar(String str)
     {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++)
        {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }
        for (char key : map.keySet())
        {
            if (map.get(key) == 1) return key;
        }
        return '~';
     }

     public int firstUniqChar(String str)
    {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++)
        {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }
        for (int i = 0; i < str.length(); i++)
        {
            if (map.get(str.charAt(i)) == 1) return i;
        }
        return -1;
    }
}