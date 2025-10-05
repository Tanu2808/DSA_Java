import java.util.HashMap;
import java.util.Map;

public class EqualArrays {
    public static boolean checkEqual(int[] a, int[] b) {
        // code here
        if (a.length != b.length) return false;
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int count = 0;
        
        for (int i = 0;i < a.length;i++)
        {
            if (map.get(a[i]) == null) map.put(a[i], 1);
            else 
            {
                count = map.get(a[i]);
                count++;
                map.put(a[i], count);
            }
        }
        for (int i = 0;i < a.length;i++)
        {
            if (!map.containsKey(b[i])) return false;
            if (map.get(b[i]) == 0) return false;
            count = map.get(b[i]);
            --count;
            map.put(b[i], count);
        }
        return true;
    }
}
