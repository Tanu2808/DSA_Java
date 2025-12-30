public class SecondLargest {

    public int secLargest(int arr[])
    { 
        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest)
            {
                secLargest = largest;
                largest = arr[i];
            }
            else if (arr[i] < largest && arr[i] > secLargest) secLargest = arr[i];
        }

        return secLargest;
    }
}