public class Fibonacci {

    public int fibonacci(int index)
    {
        if (index <= 1) return index;
        return fibonacci(index - 1) + fibonacci(index - 2);
    }

    public int fib(int n) {
        if (n < 2) return n;
        int i = 2;
        int first = 1, second = 0;
        while (i <= n)
        {
            int temp = first + second;
            second = first;
            first = temp;
            i++;

        }
        return first;
    }
}