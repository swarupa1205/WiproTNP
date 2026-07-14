package HashSetEmployee;

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        HashSet<String> employees = new HashSet<>();

        employees.add("Devi");
        employees.add("Venu");
        employees.add("Kiran");
        employees.add("Sai");

        Iterator<String> itr = employees.iterator();

        System.out.println("Employee Names:");

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}