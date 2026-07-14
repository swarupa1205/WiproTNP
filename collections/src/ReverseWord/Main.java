package ReverseWord;

import java.util.*;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();

        words.add("Java");
        words.add("Python");
        words.add("C");
        words.add("C++");
        words.add("HTML");
        words.add("CSS");
        words.add("React");
        words.add("Spring");
        words.add("SQL");
        words.add("Oracle");

        Consumer<String> reverseWord = word -> {
            String reversed = new StringBuilder(word).reverse().toString();
            int index = words.indexOf(word);
            words.set(index, reversed);
        };

        // Reverse and update the ArrayList
        new ArrayList<>(words).forEach(reverseWord);

        System.out.println("Reversed Words:");
        words.forEach(System.out::println);
    }
}
