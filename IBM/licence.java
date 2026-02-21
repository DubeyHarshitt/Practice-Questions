import java.util.*;

public class licence {

    public static String validate(String lp) {

        int length = lp.length();
        boolean hasDigit = false;

        // licP should be between 2-10
        if (length < 2 || length > 10) {
            return "INVALID";
        }

        // Uppercase
        lp = lp.toUpperCase();

        StringBuilder sb = new StringBuilder(lp);

        for (int i = 0; i < lp.length(); i++) {

            // should be at-least one int
            if (lp.charAt(i) >= '0' && lp.charAt(i) <= '9') {
                hasDigit = true;
                continue;
            } else if (lp.charAt(i) >= 'A' && lp.charAt(i) <= 'Z') {
                continue;
            } else {
                return "INVALID"; // special character
            }
        }
        if (!hasDigit) {
            return "INVALID";
        }

        // Seprating 3 with hyphen (-)
        for (int i = 3; i < sb.length(); i += 4) {
            sb.insert(i, '-');
        }

        return sb.toString();
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give the licence file :- ");
        String licP = sc.next();
        // validate(licP);
        System.out.println(validate(licP));

        sc.close();
    }
}
