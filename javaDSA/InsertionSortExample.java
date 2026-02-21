public class InsertionSortExample {
    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 4, 2};
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int current = arr[i];
            int j = i - 1;

            // Shift elements to the right to make space
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Insert the current element at its correct position
            arr[j + 1] = current;
        }

        // Print the sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
