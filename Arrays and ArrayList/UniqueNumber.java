public class UniqueNumber {
    public int findUnique(int[] arr) {
        // code here
        int result = arr[0];
        for (int i = 1;i < arr.length;i++) result = result ^ arr[i];
        return result;
    }
}
