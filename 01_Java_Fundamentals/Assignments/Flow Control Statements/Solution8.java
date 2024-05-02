
import java.util.*;

/*
 * Q.8) Write a program to recieve a color code from the user
 */
public class Solution8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a color code (R/B/G/O/Y/W): ");
        char ch = sc.next().charAt(0);

        switch (ch) {
            case 'R' -> System.out.println("Red");
            case 'B' -> System.out.println("Blue");
            case 'G' -> System.out.println("Green");
            case 'O' -> System.out.println("Orange");
            case 'Y' -> System.out.println("Yellow");
            case 'W' -> System.out.println("White");
            default -> System.out.println("Invalid Code");
        }

        sc.close();
    }
}