
import java.util.HashMap;

public class HighestLowest {

    public record Result(int max,int min) {}
    public Result highestLowest(int arr[])
    {
        HashMap<Integer, Integer> frequencies = new HashMap<>();
        for (int i: arr)
        {
            frequencies.put(arr[i], frequencies.getOrDefault(arr[i], 0) + 1);
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int value: frequencies.values())
        {
            if (value > max) max = value;
            if (value < min) min = value;
        }
        return new Result(max, min);
    }
}