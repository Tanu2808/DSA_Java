public class Palindrome {

    public boolean palindrome(String str, int i)
    {
        if (i >= str.length() / 2) return true;
        if (str.charAt(i) != str.charAt(str.length() - i - 1)) return false;
        return palindrome(str, i + 1);

    }

    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start < end)
        {
            if (!Character.isLetterOrDigit(s.charAt(start)))
            {
                start++;
            }
            if (!Character.isLetterOrDigit(s.charAt(end)))
            {
                end--;
            }
            if (Character.isLetterOrDigit(s.charAt(start)) && Character.isLetterOrDigit(s.charAt(end)))
            {
                if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) return false;
                start++;
                end--;
            }
        }
        return true;
    }
}