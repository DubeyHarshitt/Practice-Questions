public class SelectionSort {
    public int[] sort() {
        int[] nums = {7, 4, 1, 5, 3};  // ✅ correct array initialization
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            int min = i;

            // Find index of minimum element
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[min]) {
                    min = j;
                }
            }

            // Swap nums[i] and nums[min]
            int temp = nums[min];
            nums[min] = nums[i];
            nums[i] = temp;
        }

        return nums;
    }

    public static void main(String[] args) {
        SelectionSort sorter = new SelectionSort();
        int[] sorted = sorter.sort();

        // Print sorted array
        for (int num : sorted) {
            System.out.print(num + " ");
        }
    }
}
