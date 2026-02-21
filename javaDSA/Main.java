import java.util.Scanner;

/*
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :- ");
        int n = sc.nextInt();

        // Outer loop for Spaces
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= (n-i)+1; j++) {
                System.out.print(" ");
            }
            // inner loop for Stars
            for (int j = 1; j <= (2*i)+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
 */

/*
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :- ");
        int n = sc.nextInt();

//        outer loop
        for (int i = 0; i < n; i++) {
//            Printing Spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
//            Printing Stars
            for (int j = 0; j < (2*n)-1-(2*i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
 */

/*
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :- ");
        int n = sc.nextInt();

        // Printing Outer loop
        for (int i = 0; i < n; i++) {
            // Printing spaces of First half
            for (int j = 0; j < (n - i) - 1; j++) {
                System.out.print(" ");
            }
            // Printing stars of First half
            for (int j = 0; j < (2 * i) + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            // Printing spaces of Second half
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Printing stars of Second half
            for (int j = 0; j < (2 * n) - 1 - (2 * i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
 */

/*
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :- ");
        int n = sc.nextInt();

        for (int i = 0; i < 2*n; i++) {
            int stars;
            if (i < n) {
                stars = i + 1; // First half: Increasing stars
            } else {
                stars = 2 * n - i; // Second half: Decreasing stars
            }
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :- ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }
}