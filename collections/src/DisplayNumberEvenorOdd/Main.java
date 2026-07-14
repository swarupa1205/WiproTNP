package DisplayNumberEvenorOdd;
import java.util.*;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(2);
        numbers.add(5);
        numbers.add(10);
        numbers.add(13);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);
        numbers.add(41);
        numbers.add(50);
        numbers.add(67);

        Consumer<Integer> checkOddEven = n -> {
            if (n % 2 == 0)
                System.out.println(n + " even");
            else
                System.out.println(n + " odd");
        };

        numbers.forEach(checkOddEven);
    }
}