package StringStringBuffer;

import java.util.Scanner;

public class FrontTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String firstTwo = str.substring(0, 2);
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            result += firstTwo;
        }

        System.out.println(result);
    }
}