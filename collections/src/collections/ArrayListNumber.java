package collections;

import java.util.ArrayList;

public class ArrayListNumber {
    public static void main(String[] args) {

        ArrayList<Number> numbers = new ArrayList<>();

        numbers.add(10);      // Integer
        numbers.add(20.5);    // Double
        numbers.add(15.7f);   // Float
        numbers.add(100L);    // Long

        for (Number n : numbers) {
            System.out.println(n);
        }
    }
}