package OptionalClass;

import java.util.Optional;

public class OptionalExample3 {

    public static void main(String[] args) {
        Employee emp = null;

        try {
            Optional.ofNullable(emp)
                    .orElseThrow(() ->
                            new InvalidEmployeeException("Employee is Invalid"));

            System.out.println("Valid Employee");
        }
        catch (InvalidEmployeeException e) {
            System.out.println(e.getMessage());
        }
    }
}