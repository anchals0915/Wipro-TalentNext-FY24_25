import java.util.*;

/*
 * Q.12) Write a program to check if a given number is prime or not
 */
public class Solution12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        System.out.println("Is Prime ? " + isPrime(n));
        sc.close();
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}