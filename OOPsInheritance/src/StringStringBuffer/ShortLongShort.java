package StringStringBuffer;

import java.util.Scanner;

public class ShortLongShort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        if (a.length() < b.length()) {
            System.out.println(a + b + a);
        } else {
            System.out.println(b + a + b);
        }
    }
}