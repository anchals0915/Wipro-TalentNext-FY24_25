import java.util.*;

/*
 * Q.5)
 */
public class Solution5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character : ");
        char ch = sc.next().charAt(0);

        if (Character.isAlphabetic(ch)) {
            System.out.println("Alphabet");
        } else if (Character.isDigit(ch)) {
            System.out.println("Digit");
        } else {
            System.out.println("Special Character");
        }
        sc.close();
    }
}