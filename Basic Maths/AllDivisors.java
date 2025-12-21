
import java.util.ArrayList;
import java.util.List;

public class AllDivisors {

    public List<Integer> printDivisors(int num)
    {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < num; i++)
        {
            if (num % i == 0) list.add(i);
        }
        return list;
    }
}