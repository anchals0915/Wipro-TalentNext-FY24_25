
import java.util.Scanner;

/*
 * Write a java program that will concatenate 2 strings and return
 * the result. The result should be in lowercase 
 * 
 */
public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String[] words = sc.nextLine().trim().split(",");

        String s1 = words[0].trim().toLowerCase();
        String s2 = words[1].trim().toLowerCase();

        String result = concatenate(s1, s2);
        System.out.println("Result : " + result);
        sc.close();
    }

    public static String concatenate(String s1, String s2) {
        if (s1.charAt(s1.length() - 1) == s2.charAt(0)) {
            return s1.substring(0, s1.length() - 1) + s2;
        }
        return s1 + " " + s2;
    }
}
