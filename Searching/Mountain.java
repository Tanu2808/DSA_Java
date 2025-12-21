interface MountainArray {
    int get(int index);
    int length();
}

public class Mountain implements MountainArray{

    private int[] arr;

    public Mountain(int[] arr) {
        this.arr = arr;
    }

    public int get(int index) {
        return arr[index];
    }

    public int length() {
        return arr.length;
    }
    public int peakIndexInMountainArray(MountainArray arr)
    {
        int low = 0;
        int high = arr.length() - 1;
        while (low <= high)
        {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) > arr.get(mid + 1) && arr.get(mid) > arr.get(mid - 1)) return mid;
            if (arr.get(mid) > arr.get(mid + 1)) high = mid - 1;
            else low = mid + 1;
        }
        return -1;
    }

    public int findInMountainArray(int target, MountainArray arr)
    {
        int peak = peakIndexInMountainArray(arr);
        int low = 0;
        int high = peak;
        while (low <= high)
        {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == target) return mid;
            else if (arr.get(mid) > target) high = mid - 1;
            else low = mid + 1;
        }

        high = arr.length() - 1;
        low = peak;
        while (low <= high)
        {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == target) return mid;
            else if (arr.get(mid) < target) high = mid - 1;
            else low = mid + 1;
        }
        return -1;
    }
}