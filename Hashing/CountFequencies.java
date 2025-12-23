
import java.util.HashMap;

public class CountFequencies {

    public void countFrequencies(int arr[])
    {
        HashMap<Integer, Integer> frequencies = new HashMap<>();
        for (int i = 0;i < arr.length;i++)
        {
            frequencies.put(arr[i], frequencies.getOrDefault(arr[i], 0) + 1);
        }

        for (Integer key : frequencies.keySet())
        {
            System.out.println(key + " " + frequencies.get(key));
        }
    }

    public static void main(String[] args) {
        CountFequencies cf = new CountFequencies();
        int arr[] = {1, 2, 2, 3, 1, 4, 5, 3, 2};
        cf.countFrequencies(arr);
    }
}
