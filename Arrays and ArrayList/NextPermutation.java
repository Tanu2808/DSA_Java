public class NextPermutation {

    public void nextPermutation(int[] nums) {
        int breakPoint = -1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                breakPoint = i;
                break;
            }
        }
        if (breakPoint != -1) {
            for (int i = nums.length - 1; i > breakPoint; i--) {
                if (nums[i] > nums[breakPoint]) {
                    swap(nums, i, breakPoint);
                    breakPoint++;
                    break;
                }
            }
        }
        else breakPoint = 0;
        reverse(nums, breakPoint);
    }

    public void reverse(int[] arr, int i) {
        int j = arr.length - 1;

        while (i <= j) {
            swap(arr, i, j);
            i++;
            j--;
        }

    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}