package DigitCount;

@FunctionalInterface
interface DigitInterface {
    int countDigits(int n);
}

class DigitClass {

    public static int digitCount(int n) {

        int count = 0;

        while (n != 0) {
            count++;
            n = n / 10;
        }

        return count;
    }
}

public class Main {
    public static void main(String[] args) {

        DigitInterface di = DigitClass::digitCount;

        int result = di.countDigits(123456);

        System.out.println("Number of Digits = " + result);
    }
}