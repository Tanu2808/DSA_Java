public class Parameterized {
    void sumFirstN(int n, int sum)
    {
        if (n < 1)
        {
            System.out.println(sum);
            return;
        }
        sumFirstN( n - 1, sum);
    }

    int sumFirstN(int n)
    {
        if (n == 0) return 0;
        return n + sumFirstN(n - 1);
    }
}
