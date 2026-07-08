package StringStringBuffer;

import java.util.Scanner;

public class StarOut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*')
                continue;

            if (i > 0 && str.charAt(i - 1) == '*')
                continue;

            if (i < str.length() - 1 && str.charAt(i + 1) == '*')
                continue;

            result += str.charAt(i);
        }

        System.out.println(result);
    }
}