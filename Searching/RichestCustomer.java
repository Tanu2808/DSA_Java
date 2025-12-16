package Searching;

public class RichestCustomer {

    public int maximumWealth(int[][] accounts)
    {
        int maxWealth = 0;

        for (int[] i: accounts)
        {
            int sum = 0;
            for (int j: i)
            {
                sum += j;
            }
            if (sum > maxWealth) maxWealth = sum;
        }

        return maxWealth;
    }
}