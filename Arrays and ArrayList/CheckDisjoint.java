import java.util.HashSet;

public class CheckDisjoint {
    public boolean areDisjoint(int[] a, int[] b) {
        // code here
        HashSet<Integer> hashSet = new HashSet<>();
        for (int num: a)
        {
            hashSet.add(num);
        }
        for (int num: b)
        {
            if (hashSet.contains(num)) return false;
        }
        return true;
    }
}
