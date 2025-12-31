public class SingleNumber {

    public int findingSingle(int[] arr)
    {
        int xor = arr[0];
        for (int i = 1; i < arr.length; i++) {
            xor = xor ^ arr[i];
        }
        return xor;
    }
}