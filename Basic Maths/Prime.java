public class Prime {

    public static boolean checkPrime(int num)
    {
        if (num <= 1) return false;
        int count = 0;
        for (int i = 2;i < num;i++)
        {
            if (num % i == 0) count++;
            if (count != 0) return false;
        }
        return true;
    }
}