// // 100110 -> 3 switch required

import java.util.*;

public class password {

    public static int solution(String input) {
        int flips = 0;

        // process pairs of size 2
        for (int i = 0; i < input.length(); i += 2) {

            // if pair is mismatched, one flip needed
            if (input.charAt(i) != input.charAt(i + 1)) {
                flips++;
            }
        }

        return flips;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String :- ");
        String input = sc.next();

        System.out.println("Minimum flips required :- " + solution(input));
    }
}

