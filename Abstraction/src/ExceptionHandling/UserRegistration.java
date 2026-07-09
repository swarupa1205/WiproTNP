package ExceptionHandling;

class InvalidCountryException extends Exception {
    public InvalidCountryException(String message) {
        super(message);
    }
}

public class UserRegistration {

    void registerUser(String username, String userCountry)
            throws InvalidCountryException {

        if (!userCountry.equalsIgnoreCase("India")) {
            throw new InvalidCountryException(
                    "User Outside India cannot be registered");
        }

        System.out.println("User registration done successfully");
    }

    public static void main(String[] args) {
        UserRegistration obj = new UserRegistration();

        try {
            obj.registerUser(args[0], args[1]);
        } catch (InvalidCountryException e) {
            System.out.println(e.getMessage());
        }
    }
}