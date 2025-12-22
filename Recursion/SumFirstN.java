public class SumFirstN {
    
    public static int sumFirstN(int num)
    {
        int sum = 0;
        for (int i = 1; i <= num; i++)
        {
            sum += i;
        }
        return sum;
    }

    public static void sumFirstN(int num, int sum)
    {
        if (num == 0)
        {
            System.out.println(sum);
            return;
        }
        sumFirstN(num - 1, sum + num);
    }

    public static int sumFirstNum(int num)
    {
        if (num == 0) return 0;
        return num + sumFirstN(num - 1);
    }
}
