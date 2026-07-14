package Generate10Primenumber;

import java.util.*;
import java.util.function.Supplier;

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

        Supplier<ArrayList<Integer>> supplier = () -> {

            ArrayList<Integer> primes = new ArrayList<>();

            int num = 2;

            while (primes.size() < 10) {
                if (isPrime(num)) {
                    primes.add(num);
                }
                num++;
            }

            return primes;
        };

        ArrayList<Integer> primeNumbers = supplier.get();

        System.out.println("First 10 Prime Numbers:");
        System.out.println(primeNumbers);
    }
}