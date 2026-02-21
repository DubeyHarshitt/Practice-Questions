import java.util.*;

// Reverse an Array ( using Loop )
public class RverseArray {

//    Simple Method
    public static void reverse(int[] array) {
        int[] arr2 = new int[5];
        int j = 4; // Assuming array length is 5
        for (int i = 0; i < array.length; i++) {
            arr2[i] = array[j];  // Copy elements in reverse order
            j--;
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }

//    Swap Method
public static void reverseSwap(int[] array) {
    int start = 0;
    int end = array.length - 1;
    while (start < end) {
        // Swap elements
        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;
        start++;
        end--;
    }
    System.out.println("Reversed Array: ");
    for (int num : array) {
        System.out.print(num + " ");
    }
}

//    Recursion method
public static void reverseRecursion(int strt, int end, int[] array) {
        if(strt>end) return;
        int temp = array[strt];
        array[strt] = array[end];
        array[end] = temp;
        reverseRecursion(strt+1,end-1,array);
}

//    Recursion method using one parameter
public static void recursionOneVar(int[] array, int i) {
        int n = array.length;
        if (i> n/2) return;
        int temp = array[i];
        array[i] = array[n-i-1];
        array[n-i-1] = temp;
        recursionOneVar(array, i+1);
    }

//    Check the string is palindrome or not
    public static void palindromeRecurssion(String str, int x){
        if(x<0) return;
        rev.append(str.charAt(x));
        palindromeRecurssion(str,x-1);
    };

//    Check Palindrome Array
    public static Boolean palindromeArray(int[] arr, int i){
        int n = arr.length;
        if(i>= n/2) return true;
        if(arr[i] != arr[n - 1 - i]) return false;
        return palindromeArray(arr, i+1);
    };


    static StringBuilder rev = new StringBuilder();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the elements in array : ");
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        if (palindromeArray(arr, 0)) {
            System.out.println("Array is Palindrome");
        } else {
            System.out.println("Array is Not a Palindrome");
        }

//        reverse(arr);
//        reverseSwap(arr);
//        reverseRecursion(0, arr.length-1, arr);
//        recursionOneVar(arr, 0);
//        palindromeRecurssion(str, x );
        palindromeArray(arr, 0);
//        System.out.println("Reversed Array: " + java.util.Arrays.toString(arr));
    }
}
