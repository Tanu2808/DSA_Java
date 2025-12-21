public class GCD {

    public int hcf(int num1, int num2)
    {
        int result = 0;
        int max, min;
        if (num1 == num2) return num1;
        else if (num1 > num2)
        {
            max = num1;
            min = num2;
        }
        else
        {
            max = num2;
            min = num1;
        }

        for (int i = 1; i <= max; i++)
        {
            if (i > min) break;
            if (num1 % i == 0 && num2 % i == 0) result = i;
        }
        return result;
    }
}