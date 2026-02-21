import java.util.*;

/*
public class Recursion {
    static int count = 0;
    static void counting(){
        if(count == 3) return; // Base Case
        System.out.println(count);
        count++;
        counting();
    }

    public static void main(String[] args) {
        counting();
    }
}
*/

// Print Name five times
/*
public class Recursion {
    public static void names(int i, int n){
        if(i>n) return;
        System.out.println("Harshit");
        names(i+1, n);
    }

    public static void main(String[] args) {
        names(1,5);
    }
}
// TC = O(n)  SC = O(n)
 */

// Print Linearly from 1 to n
/*
public class Recursion {

    public static void linear(int i, int n){
        if(i > n) return;
        System.out.print(i+ " ");
        linear(i+1, n);
    }

    public static void main(String[] args){
        linear(1,20);
    }
}
// TC = O(n)  SC = O(n)
 */

// Print from N to 1
/*
public class Recursion {

    public static void linear(int n1, int n2){
        if(n2 < n1) return;
        System.out.print(n2+ " ");
        linear(n1, n2-1);
    }

    public static void main(String[] args){
        linear(1,20);
    }
}
// TC = O(n)  SC = O(n)
 */

// Print linearly from 1 to N ( By Backtracking )
/*
public class Recursion {

    public static void backtracking(int i){
        if(i < 1) return;
        backtracking(i-1);
        System.out.print(i+ " ");
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :- ");
        int n = sc.nextInt();
        backtracking(n);
    }
}
 */

// Print N to 1 ( By Backtracking )
public class Recursion {

    public static void backtracking(int i, int n) { // Added 'n' parameter
        if (i > n) { // Corrected base case
            return;
        }
        backtracking(i + 1, n);
        System.out.print(i + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :- ");
        int n = sc.nextInt();
        backtracking(1, n); // Start from 1, pass 'n'
        sc.close(); // Close the scanner to prevent resource leak.
    }
}