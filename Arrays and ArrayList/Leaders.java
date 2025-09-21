import java.util.ArrayList;

public class Leaders
{
    @SuppressWarnings("unused")
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        
        int maxRight = arr[arr.length - 1];
        
        result.add(maxRight);
        
        for (int i = arr.length - 2;i >= 0;i--)
        {
            if (arr[i] >= maxRight)
            {
                maxRight = arr[i];
                result.add(0, maxRight);
            }
        }
        return result;
    }
}
