import java.util.HashMap;
import java.util.Map;

public class UniqueCharacters {

    public boolean  uniqueCharacter(String str)
    {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0;i < str.length();i++)
        {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
            if (map.containsValue(2)) return false;
        }
        return true;
    }
}