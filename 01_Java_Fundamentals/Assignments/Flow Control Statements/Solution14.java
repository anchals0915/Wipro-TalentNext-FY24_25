import java.util.*;

/*
 * Q.14) Write a program to print the sum of all digits
 * of a given number
 */
public class Solution14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        System.out.println("The sum of digits of " + n + " is: " + sumOfDigits(n));
    }

    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}