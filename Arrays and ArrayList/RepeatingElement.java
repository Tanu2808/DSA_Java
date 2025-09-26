public class RepeatingElement {
    public int findDuplicate(int[] arr) {
        // code here
        int result = 0;
        for (int i = 0;i < arr.length - 1;i++)
        {
            result = result ^ (i + 1) ^ arr[i];
        }
        result = result ^ arr[arr.length - 1];
        return result;
    }
}
