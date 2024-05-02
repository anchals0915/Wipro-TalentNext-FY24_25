import java.util.*;

/*
 * Q.1) A] Write a program to check if a given integer number is positive,
 * negative, or zero.   
 */
class Solution1A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int n = sc.nextInt();
        if (n > 0) {
            System.out.println("Positive number");
        } else if (n < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("Zero");
        }
        sc.close();
    }

}

/*
 * Q.1) B] Given two non-negative int vales , print true if they have the same
 * last digit, such as with 27 and 57
 */
class Solution1B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first non-negative integer: ");
        int a = sc.nextInt();

        System.out.print("Enter the second non-negative integer: ");
        int b = sc.nextInt();

        if (a % 10 == b % 10) {
            System.out.println("Both numbers have the same last digit.");
        } else {
            System.out.println("Both numbers do not have the same last digit.");
        }

        sc.close();
    }
}
