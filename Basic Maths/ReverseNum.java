import java.util.Scanner;

public class ReverseNum {

    public static void main(String[] args) {
		// Write your code here
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int reverse = 0;
		while (num > 0)
		{
			reverse = (reverse * 10) + (num % 10);
			num /= 10;
		}
		System.out.println(reverse);
        input.close();
	}
}