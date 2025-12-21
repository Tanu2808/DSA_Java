public class Armstrong
{
    public static boolean isArmstrong(int num)
    {
        int length = String.valueOf(num).length();
        int temp = num;
        int sum = 0;
        while (num != 0)
        {
            sum += (Math.pow((num % 10), length));
            num /= 10;
        }
        return temp == sum;
    }
}