package FilterPerfectSquare;

import java.util.*;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(4);
        numbers.add(7);
        numbers.add(9);
        numbers.add(10);
        numbers.add(16);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);
        numbers.add(36);
        numbers.add(50);

        Predicate<Integer> p = n -> {
            int root = (int)Math.sqrt(n);
            return root * root == n;
        };

        System.out.println("Perfect Square Numbers:");

        numbers.stream()
                .filter(p)
                .forEach(System.out::println);
    }
}