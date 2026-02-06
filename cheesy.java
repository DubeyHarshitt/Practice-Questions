// 1. Find the first Vowel
// 2. move all the consonants before the vowel
// 3. add "ay" to the end ;

import java.util.*;

public class cheesy {

    public static String solution(String input) {
        input = input.toLowerCase();
        int len = input.length();
        int index = -1;

        for (int i = 0; i < len; i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                index = i;
                break;
            }
        }

        String consonantString = input.substring(0, index);
        String remainingString = input.substring(index);

        return remainingString + consonantString + "ay";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String :-  ");
        String input = sc.next();
        System.out.println(solution(input));
    }
}
