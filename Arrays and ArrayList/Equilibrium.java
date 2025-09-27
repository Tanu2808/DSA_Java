public class Equilibrium
{
    public static int findEquilibrium(int arr[]) {
        // code here
        int prefSum = 0, sum = 0;
        for (int i: arr) 
        {
            sum += i;
        }
        
        for (int i = 0;i < arr.length;i++)
        {
            int suffSum = sum - prefSum - arr[i];
            if (prefSum == suffSum) return i;
            prefSum += arr[i];
        }
        return -1;
        
    }
}