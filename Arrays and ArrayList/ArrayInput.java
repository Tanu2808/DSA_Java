
import java.util.Scanner;

public class ArrayInput {

    public static void main(String args[])
    {
        try (Scanner input = new Scanner(System.in)) 
        {
            int[] arr = new int[5];

            for (int i = 0;i < arr.length;i++)
            {
                arr[i] = input.nextInt();
            }

            for (int i : arr) 
            {
                System.out.println(i);                
            }
        }
    }
}