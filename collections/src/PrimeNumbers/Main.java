package PrimeNumbers;

import java.util.ArrayList;

public class Main {

    public static boolean isPrime(int n) {
        if (n < 2)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        ArrayList<Integer> a1 = new ArrayList<>();

        a1.add(2);
        a1.add(5);
        a1.add(8);
        a1.add(11);
        a1.add(15);
        a1.add(17);
        a1.add(20);
        a1.add(23);
        a1.add(27);
        a1.add(29);
        a1.add(31);
        a1.add(33);
        a1.add(37);
        a1.add(40);
        a1.add(41);
        a1.add(45);
        a1.add(47);
        a1.add(50);
        a1.add(53);
        a1.add(59);
        a1.add(60);
        a1.add(61);
        a1.add(67);
        a1.add(70);
        a1.add(71);

        System.out.println("Prime Numbers:");

        a1.forEach(num -> {
            if (isPrime(num))
                System.out.println(num);
        });
    }
}