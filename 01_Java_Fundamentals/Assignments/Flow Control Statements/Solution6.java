
/*
 * Q.6)
 */
public class Solution6 {
    public static void main(String[] args) {

        String gender = args[0];
        int age = Integer.parseInt(args[1]);

        if (gender.equalsIgnoreCase("Female")) {
            if (age > 0 && age <= 58) {
                System.out.println("Percentage of interest for female under 58: 8.2%");
            } else if (age >= 59 && age <= 100) {
                System.out.println("Percentage of interest for female over 58: 9.2%");
            } else {
                System.out.println("Invalid age.");
            }
        } else if (gender.equalsIgnoreCase("Male")) {
            if (age > 0 && age <= 58) {
                System.out.println("Percentage of interest for male under 58: 8.4%");
            } else if (age >= 59 && age <= 100) {
                System.out.println("Percentage of interest for male over 58: 10.5%");
            } else {
                System.out.println("Invalid age.");
            }
        } else {
            System.out.println("Invalid gender.");
        }

    }
}