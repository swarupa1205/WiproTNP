package OddLength;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> a1 = new ArrayList<>();

        a1.add("Java");
        a1.add("Python");
        a1.add("C");
        a1.add("CPlusPlus");
        a1.add("HTML");
        a1.add("CSS");
        a1.add("JavaScript");
        a1.add("React");
        a1.add("Spring");
        a1.add("SQL");

        System.out.println("Strings with Odd Length:");

        a1.forEach(word -> {
            if (word.length() % 2 != 0)
                System.out.println(word);
        });
    }
}