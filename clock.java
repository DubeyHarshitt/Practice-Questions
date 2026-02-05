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
        if (second.charAt(0) == '@') {
            minTime = ans(hour, minute, second.replace('@', '0'));
            maxTime = ans(hour, minute, second.replace('@', '5'));
        }

        if (minute.charAt(1) == '@') {
            minTime = ans(hour, minute.replace('@', '0'), second);
            maxTime = ans(hour, minute.replace('@', '9'), second);
        }
        if (minute.charAt(0) == '@') {
            minTime = ans(hour, minute.replace('@', '0'), second);
            maxTime = ans(hour, minute.replace('@', '5'), second);
        }


        if (hour.charAt(1) == '@') {
            if (hour.charAt(0) == '1') {
            minTime = ans(hour.replace('@', '0'), minute, second);
            maxTime = ans(hour.replace('@', '9'), minute, second);
        }
        else{
            minTime = ans(hour.replace('@', '0'), minute, second);
            maxTime = ans(hour.replace('@', '4'), minute, second);
        }
        }
        if (hour.charAt(0) == '@') {
            minTime = ans(hour.replace('@', '0'), minute, second);
            maxTime = ans(hour.replace('@', '2'), minute, second);
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
