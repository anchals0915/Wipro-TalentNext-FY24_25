
/*
 * Q.17) Write a Java program to find if the given number is palindrome or not
 */
public class Solution17 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please a number");
            return;
        }

        int n = Integer.parseInt(args[0]);
        if (isPalindrome(n)) {
            System.out.println(n + " is a palindrome number.");
        } else {
            System.out.println(n + " is not a palindrome number.");
        }
    }

    public static boolean isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;
        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        return originalNum == reversedNum;
    }
}