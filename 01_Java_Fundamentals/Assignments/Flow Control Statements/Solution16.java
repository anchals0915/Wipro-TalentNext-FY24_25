import java.util.*;

/*
 * Q.16) Write a program to reverse a given number and
 * print
 * 
 * I/P: 1234
 * O?P: 4321
 */
public class Solution16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("\n" + reverse(n));

        sc.close();
    }

    public static int reverse(int n) {
        int reverse = 0;
        while (n != 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }
        return reverse;
    }
}
