class Solution {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    public int[] selectionSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            // find the max item in the remaining array and swap with correct index
            int last = nums.length - i - 1;
            int maxIndex = getMaxIndex(nums, 0, last);
            swap(nums, maxIndex, last);
        }
        return nums;
    }
}