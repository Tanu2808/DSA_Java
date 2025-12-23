import java.util.HashMap;

public class MaxFrequency {

    public int maxFrequencyElements(int[] arr) {
        int frequency = 0, count = 0;
        HashMap<Integer, Integer> frequencies = new HashMap<>();
        for (int i = 0;i < arr.length;i++)
        {
            frequencies.put(arr[i], frequencies.getOrDefault(arr[i], 0) + 1);
        }

        for (int val: frequencies.values())
        {
            if (val == frequency) count++;
            else if (val > frequency)
            {
                frequency = val;
                count = 1;
            }
        }

        return count * frequency;
    }
}