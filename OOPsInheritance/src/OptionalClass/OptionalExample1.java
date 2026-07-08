package OptionalClass;

import java.util.Optional;

public class OptionalExample1 {
    public static void main(String[] args) {
        String names[] = new String[5];

        Optional<String> name = Optional.ofNullable(names[0]);

        System.out.println(name.map(String::length).orElse(0));
    }
}