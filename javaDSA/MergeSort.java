public class MergeSort {

    public static void main(String[] args) {
        int[] nums = {5, 3, 1, 4, 2};

        mergeSort(nums, 0, nums.length - 1);

        // Print the sorted array
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void mergeSort(int[] nums, int low, int high) {
        if (low >= high) return;

        int mid = low + (high - low) / 2;

        mergeSort(nums, low, mid);
        mergeSort(nums, mid + 1, high);

        merge(nums, low, mid, high);
    }

    public static void merge(int[] nums, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int left = low;
        int right = mid + 1;
        int k = 0;

        while (left <= mid && right <= high) {
            if (nums[left] <= nums[right]) {
                temp[k] = nums[left];
                k++;
                left++;
            } else {
                temp[k++] = nums[right++];
            }
        }

        while (left <= mid) {
            temp[k++] = nums[left++];
        }

        while (right <= high) {
            temp[k++] = nums[right++];
        }

        for (int i = 0; i < temp.length; i++) {
            nums[low + i] = temp[i];
        }
    }
}
