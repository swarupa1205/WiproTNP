package NegativeEvenNumbers;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(-2);
        list.add(5);
        list.add(-4);
        list.add(8);
        list.add(-10);
        list.add(7);
        list.add(-12);
        list.add(15);
        list.add(20);
        list.add(-18);

        ArrayList<Integer> result = list.stream()
                .filter(n -> n < 0 && n % 2 == 0)
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println("Negative Even Numbers:");
        result.forEach(System.out::println);
    }
}