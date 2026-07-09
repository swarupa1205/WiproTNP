package Lambda;

interface Test {
    int myFunction(int a, int b, int c);
}

public class Main {
    public static void main(String[] args) {

        // Addition of three numbers
        Test t1 = (a, b, c) -> a + b + c;

        // Multiplication of three numbers
        Test t2 = (a, b, c) -> a * b * c;

        System.out.println("Addition = " + t1.myFunction(10, 20, 30));
        System.out.println("Multiplication = " + t2.myFunction(10, 20, 30));
    }
}
