public class BasicProblems {
    int counter = 1;
    public void printName(int n)
    {
        if (counter > n) return;
        System.out.println("Tanush");
        counter++;
        printName(n);
    }

    public void printNum(int i, int num)
    {
        if (i > num) return;
        System.out.println(i);
        printNum(i + 1, num);
    }

    public void printNum(int num)
    {
        if (num == 0) return;
        System.out.println(num);
        printNum(num - 1);
    }
}