package Day2Day3Day4;

import java.util.Scanner;
import java.lang.Math;


public class LastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int lastDigit = last(n);
        System.out.println(lastDigit);

        sc.close();
    }

    static int last(int n) {
        return Math.abs(n % 10);
    }
}