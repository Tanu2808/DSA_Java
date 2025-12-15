package Searching;
public class LinearSearchString {

    public int searchInString(String str, char ch)
    {
        for (int i = 0; i < str.length(); i++) if (str.charAt(i) == (ch)) return i;
        return -1;
    }
}