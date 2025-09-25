public class EvenGreater
{
    public ArrayList<Integer> rearrangeArray(ArrayList<Integer> arr) {
        // code here
        Collections.sort(arr);
        ArrayList<Integer> result = new ArrayList<>(Collections.nCopies(arr.size(), 0));
        int start = 0, end = arr.size() - 1;
        
        for (int i = 0;i < arr.size();i++)
        {
            if ((i + 1) % 2 == 0) result.set(i, arr.get(end--));
            else result.set(i, arr.get(start++));
        }
        return result;
    }
}