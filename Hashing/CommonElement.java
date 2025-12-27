
import java.util.HashMap;
import java.util.Map;

public class CommonElement {
    public int commonElement(int arr1[], int arr2[])
    {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            map.put(arr1[i],i);
            
        }
        for (int i: arr2)
        {
            if (map.containsKey(i)) return i;
        }
        return -1;
    }
}
