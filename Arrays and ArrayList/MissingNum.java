public class MissingNum {
    int missingNum(int arr[]) {
        // code here
        int xor1 = 0, xor2 = 0;
        for (int i = 0;i < arr.length;i++)
        {
            xor1 ^= arr[i];
            xor2 ^= (i + 1);
        }
        xor2 ^= (arr.length + 1);
        return xor2 ^ xor1;
    }
}
