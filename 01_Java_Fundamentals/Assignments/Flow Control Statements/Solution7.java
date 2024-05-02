import java.util.*;

/*
 * Q.7)
 */
public class Solution7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a alphabet : ");
        char ch = sc.next().charAt(0);

        if (Character.isLowerCase(ch)) {
            System.out.println(ch + " -> " + Character.toUpperCase(ch));
        }

        if (Character.isUpperCase(ch)) {
            System.out.println(ch + " -> " + Character.toLowerCase(ch));
        }

        sc.close();
    }
}
