public class CountDigits {
    static int countDigit(long x) {
        // Write your code here.
        int count = 0;
        while (x > 0)
        {
            count++;
            x /= 10;
        }
        return count;
    }
}