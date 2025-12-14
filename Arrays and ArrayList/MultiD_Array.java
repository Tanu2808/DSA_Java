import java.util.Scanner;

public class MultiD_Array {

    public static void main(String[] args)
    {
        try (Scanner input = new Scanner(System.in))
        {
            int arr[][] = new int[3][3];
            // First brackets represent no. of rows
            // Second bracket represent no. of elements in each row
            for (int[] arr1 : arr)
            {
                for (int j = 0; j < arr[0].length; j++)
                {
                    arr1[j] = input.nextInt();
                }
            }

            for (int[] arr1 : arr)
            {
                for (int j = 0; j < arr[0].length; j++)
                {
                    System.out.print(arr1[j] + " ");
                }
                System.out.println();
            }
        }

    }
}