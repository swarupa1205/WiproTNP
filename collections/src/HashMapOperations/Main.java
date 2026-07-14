package HashMapOperations;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();

        map.put("India", "Delhi");
        map.put("Japan", "Tokyo");
        map.put("USA", "Washington");

        // Check key
        if (map.containsKey("India")) {
            System.out.println("Key India exists");
        } else {
            System.out.println("Key India does not exist");
        }

        // Check value
        if (map.containsValue("Tokyo")) {
            System.out.println("Value Tokyo exists");
        } else {
            System.out.println("Value Tokyo does not exist");
        }

        // Iterator
        System.out.println("\nUsing Iterator:");

        Iterator<Map.Entry<String, String>> itr =
                map.entrySet().iterator();

        while (itr.hasNext()) {
            Map.Entry<String, String> entry = itr.next();

            System.out.println(
                    entry.getKey() + " -> " +
                    entry.getValue());
        }
    }
}