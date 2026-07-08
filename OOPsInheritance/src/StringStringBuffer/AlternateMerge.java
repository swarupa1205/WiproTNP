package StringStringBuffer;

import java.util.Scanner;

public class AlternateMerge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        String result = "";
        int min = Math.min(a.length(), b.length());

        for (int i = 0; i < min; i++) {
            result += a.charAt(i);
            result += b.charAt(i);
        }

        result += a.substring(min);
        result += b.substring(min);

        System.out.println(result);
    }
}