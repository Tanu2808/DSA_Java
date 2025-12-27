
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Anagram {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++)
        {
            map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i), 0) + 1);
            map2.put(t.charAt(i), map2.getOrDefault(t.charAt(i), 0) + 1);

        }

        for (char key : map1.keySet())
        {
            if (!Objects.equals(map2.get(key), map1.get(key))) return false;
        }

        return true;
    }
}