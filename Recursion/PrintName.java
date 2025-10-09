public class PrintName
{
    static int count = 1;
    static void name()
    {
        System.out.println("Tanush");
        if (count == 5) return;
        count++;
        name();
    }
    static void name(int n)
    {
        System.out.println("Tanush");
        if (n == 1) return;
        n--;
        name(n);
    }
    void name(int i, int n)
    {
        if (i == n) return;
        name(i + 1, n);
        System.out.println("Tanush");
    }
    public static void main(String[] args)
    {
        name();
    }
}