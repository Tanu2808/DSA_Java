public class IntroRecursion {
    public void printNum(int n)
    {
        if (n > 5) return;
        System.out.println(n);
        n++;
        printNum(n);
    }
}
