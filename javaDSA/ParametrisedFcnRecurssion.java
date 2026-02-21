import java.util.Scanner;

// Print Sum of N numbers ( Parametrised way )
/*
public class ParametrisedFcnRecurssion {
    public static void parameter(int n, int sum){
        if(n<0){
            System.out.println("sum is "+ sum);
            return;
        }
        parameter(n-1, sum+n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        parameter(num,0);
    }
}
 */

// Print Sum of N numbers ( Functional Recursion )
/*
public class ParametrisedFcnRecurssion {
    public static int parameter(int n){
        if(n == 0) return 0;
        return n + parameter(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        int n = parameter(num);
        System.out.println("The Sum is : "+ n);
    }
}
*/

// Factorial of N
public class ParametrisedFcnRecurssion {
    public static int fact(int n){
        if(n==0) return 1;
        return n * fact(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        System.out.println( fact(num) );
    }
}