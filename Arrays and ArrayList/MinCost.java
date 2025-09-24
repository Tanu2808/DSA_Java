public class MinCost {
    public int cost(int[] arr) {
        // code here
        int min = arr[0];
        
        for (int i = 1;i < arr.length;i++)
        {
            if (arr[i] < min) min = arr[i];
        }
        
        return (arr.length - 1) * min;
    }
}
