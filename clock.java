// 24 hrs clock
// 10:25:30. -> 10:25:3@ find min and max

import java.util.*;

public class clock {

    public static String ans(String h, String m, String s) {
        return h + ":" + m + ":" + s;
    }

    public static void setClock(String input) {

        String hour = input.substring(0, 2);
        String minute = input.substring(3, 5);
        String second = input.substring(6, 8);

        String minTime = "";
        String maxTime = "";

        if (second.charAt(1) == '@') {
            minTime = ans(hour, minute, second.replace('@', '0'));
            maxTime = ans(hour, minute, second.replace('@', '9'));
        }

        System.out.println(minTime);
        System.out.println(maxTime);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Time :- ");
        String input = sc.next();   

        setClock(input);

        sc.close();
    }
}
