
/*
 * Q.13) Write a program to print prime numbers between 10 and 99
 */
public class Solution13 {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 10 and 99:");
        for (int i = 10; i < 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + "\t");
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
