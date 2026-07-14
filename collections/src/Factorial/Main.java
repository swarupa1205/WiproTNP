package Factorial;

@FunctionalInterface
interface FactorialInterface {
    int findFactorial(int n);
}

class FactorialClass {

    public int factorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }
}

public class Main {
    public static void main(String[] args) {

        FactorialClass obj = new FactorialClass();

        FactorialInterface fi = obj::factorial;

        int result = fi.findFactorial(5);

        System.out.println("Factorial = " + result);
    }
}