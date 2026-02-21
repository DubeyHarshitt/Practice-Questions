public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {10, 7, 8, 9, 1, 5};

        quickSort(nums, 0, nums.length - 1);

        System.out.println("Sorted array:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void quickSort(int[] nums, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(nums, low, high);
            quickSort(nums, low, partitionIndex);
            quickSort(nums, partitionIndex + 1, high);
        }
    }

    public static int partition(int[] nums, int low, int high) {
        int pivot = nums[low];
        int i = low;
        int j = high;

        while (true) {
             while (nums[i] < pivot) i++;

             while (nums[j] > pivot) j--;

            if (i >= j)
                return j;

            // Swap nums[i] and nums[j]
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}
