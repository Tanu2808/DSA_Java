public class Palindrome {

    public boolean palindrome(String str, int i)
    {
        if (i >= str.length() / 2) return true;
        if (str.charAt(i) != str.charAt(str.length() - i - 1)) return false;
        return palindrome(str, i + 1);

    }
}