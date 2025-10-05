public class ArraySubset
{
    public boolean isSubset(int a[], int b[]) {
        // Your code here
        Set<Integer> hashSet = new HashSet<>();
        for (int num: a)
        {
            hashSet.add(num);
        }
        
        for (int num: b)
        {
            if (!hashSet.contains(num)) return false;
        }
        return true;
    }
}