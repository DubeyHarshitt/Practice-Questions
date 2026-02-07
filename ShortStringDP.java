// 1. You are given a string word made of lowercase English letters.
// 2. Students can perform an operation (a “move”) to reduce the length of the string.
// 3. Your task is:
// 4. Find the minimum number of moves needed to make the word as short as possible.

// { For each move:
// Pick an index i
// Find nearest same char on left
// Find nearest same char on right
// Delete them
// Increment move counter
// Repeat }

// import java.util.*;

// public class sortString {

//     public static int solution(String word) {

//         StringBuilder sb = new StringBuilder(word);
//         int moves = 0;

//         while (true) {

//             boolean changed = false;

//             for (int i = 0; i < sb.length(); i++) {

//                 char c = sb.charAt(i);

//                 int left = -1, right = -1;

//                 // Find first same char to the left
//                 for (int j = i - 1; j >= 0; j--) {
//                     if (sb.charAt(j) == c) {
//                         left = j;
//                         break;
//                     }
//                 }

//                 // Find first same char to the right
//                 for (int j = i + 1; j < sb.length(); j++) {
//                     if (sb.charAt(j) == c) {
//                         right = j;
//                         break;
//                     }
//                 }

//                 // If we can delete something
//                 if (left != -1 || right != -1) {

//                     // Delete right first
//                     if (right != -1) sb.deleteCharAt(right);

//                     // Delete left after
//                     if (left != -1) sb.deleteCharAt(left);

//                     moves++;
//                     changed = true;
//                     break;
//                 }
//             }

//             if (!changed) break;
//         }

//         return moves;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter word: ");
//         String input = sc.next();

//         System.out.println("Minimum moves: " + solution(input));
//     }
// }

import java.util.*;

public class ShortStringDP {

    public static int solution(String word) {
        int n = word.length();
        int[][] dp = new int[n][n];

        // length 1 substrings
        for (int i = 0; i < n; i++) {
            dp[i][i] = 1;
        }

        // substrings of length >= 2
        for (int len = 2; len <= n; len++) {
            for (int l = 0; l + len - 1 < n; l++) {

                int r = l + len - 1;

                // Option 1: remove word[l] separately
                dp[l][r] = 1 + dp[l + 1][r];

                // Option 2: merge with same characters
                for (int k = l + 1; k <= r; k++) {
                    if (word.charAt(l) == word.charAt(k)) {
                        int mid = (k == l + 1) ? 0 : dp[l + 1][k - 1];
                        dp[l][r] = Math.min(dp[l][r], mid + dp[k][r]);
                    }
                }
            }
        }

        return dp[0][n - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter word: ");
        String word = sc.next();

        System.out.println("Minimum moves: " + solution(word));
    }
}
