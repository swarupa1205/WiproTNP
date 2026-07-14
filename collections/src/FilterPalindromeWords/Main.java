package FilterPalindromeWords;

import java.util.*;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();

        words.add("madam");
        words.add("java");
        words.add("level");
        words.add("hello");
        words.add("radar");
        words.add("world");
        words.add("malayalam");
        words.add("code");
        words.add("noon");
        words.add("chat");

        Predicate<String> p =
                s -> s.equals(new StringBuilder(s).reverse().toString());

        System.out.println("Palindrome Words:");

        words.stream()
                .filter(p)
                .forEach(System.out::println);
    }
}