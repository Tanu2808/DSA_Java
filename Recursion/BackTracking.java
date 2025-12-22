public class BackTracking {
    public void printNum(int i, int num)
    {
        if (i == 0) return;
        printNum(i - 1, num);
        System.out.println(i);
    }

    public void main(String[] args) {
        printNum(5, 5);
    }
}