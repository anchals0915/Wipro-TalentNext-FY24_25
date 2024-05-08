import java.util.Scanner;

/*
 * Write a program to check whether a given String is 
 * Palindrome or not. 
 */
public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.next().trim();

        boolean result = isPalindrome(str);
        System.out.println("Result: " + result);
        sc.close();
    }

    public static boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        return sb.toString().equals(str);
    }
}
