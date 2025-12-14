
import java.util.Arrays;
import java.util.Scanner;

public class ArrayToString {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) 
        {
            int arr[] = new int[5];
            System.out.println(Arrays.toString(arr));
            for (int i = 0;i < arr.length;i++)
            {
                arr[i] = input.nextInt();            
            }
            System.out.println(Arrays.toString(arr));
        }
    }
}