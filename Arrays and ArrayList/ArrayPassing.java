
import java.util.Arrays;

public class ArrayPassing {

    public static void sum(int arr[])
    {
        int sum = 0;
        for (int i: arr) sum += i;
        System.out.println(Arrays.toString(arr));
        System.out.println("Sum: " + sum);
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 3, 8};
        sum(arr);
    }
}