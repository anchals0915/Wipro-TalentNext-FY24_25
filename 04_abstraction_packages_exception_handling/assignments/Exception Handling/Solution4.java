import java.util.*;

// Solution 4 
// Step 1
class InvalidCountryException extends Exception {

    // Step 2
    public InvalidCountryException(String string) {
        super(string);
    }

}

// Step 3
class UserRegistration {
    void registerUser(String username, String userCountry) {
        try {
            if (userCountry.equals("India")) {
                System.out.println("User registration done successfully");
            } else {
                throw new InvalidCountryException("User Outside India cannot be registered");
            }
        } catch (InvalidCountryException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}

public class Solution4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            String[] ip = sc.nextLine().split(",");

            UserRegistration user = new UserRegistration();
            user.registerUser(ip[0], ip[1]);
        } finally {
            sc.close();
        }
    }
}
