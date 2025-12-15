package Searching;

public class SearchInRange {
    public int inRangeSearch(int[] arr, int target, int lower, int upper)
    {
        if (upper >= arr.length) upper = arr.length - 1;
        if (lower < 0) lower = 0;
        for (int i = lower; i <= upper; i++) if (arr[i] == target) return i;
        return -1;
    }    
}