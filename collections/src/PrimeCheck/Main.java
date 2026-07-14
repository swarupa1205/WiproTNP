package PrimeCheck;

@FunctionalInterface
interface PrimeInterface {
    PrimeCheck create(int n);
}

class PrimeCheck {

    PrimeCheck(int n) {

        boolean prime = true;

        if (n <= 1) {
            prime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
            }
        }

        if (prime)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
}

public class Main {
    public static void main(String[] args) {

        PrimeInterface pi = PrimeCheck::new;

        pi.create(17);
        pi.create(20);
    }
}