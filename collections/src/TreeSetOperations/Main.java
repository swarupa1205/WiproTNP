package TreeSetOperations;

import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<String> ts = new TreeSet<>();

        ts.add("India");
        ts.add("USA");
        ts.add("Japan");
        ts.add("Australia");

        // Reverse Order
        System.out.println("Reverse Order:");
        System.out.println(ts.descendingSet());

        // Iterator
        System.out.println("\nUsing Iterator:");
        Iterator<String> itr = ts.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // Search Element
        String search = "India";

        if (ts.contains(search)) {
            System.out.println("\n" + search + " Exists");
        } else {
            System.out.println("\n" + search + " Does Not Exist");
        }
    }
}