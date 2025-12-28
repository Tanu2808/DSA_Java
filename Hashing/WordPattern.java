
import java.util.HashMap;
import java.util.Map;

public class WordPattern {

    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        if (pattern.length() != words.length) return false;
        Map<Character, String> charToWord = new HashMap<>();
        Map<String, Character> wordToChar = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++)
        {
            char ch = pattern.charAt(i);
            String str = words[i];
            if (charToWord.containsKey(ch))
            {
                if (charToWord.containsKey(ch)) if (!charToWord.get(ch).equals(str)) return false;

            }
            else charToWord.put(ch, str);

            if (wordToChar.containsKey(str))
            {
                if (wordToChar.containsKey(str)) if (wordToChar.get(str) != ch) return false;

            }
            else wordToChar.put(str, ch);
        }
        return true;
    }
}