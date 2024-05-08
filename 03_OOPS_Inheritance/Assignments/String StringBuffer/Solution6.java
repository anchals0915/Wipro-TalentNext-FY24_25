import java.util.Scanner;

public class Solution6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String 1 : ");
        String str1 = sc.next().trim();

        System.out.print("Enter a String 2: ");
        String str2 = sc.next().trim();

        String result = func(str1, str2);
        System.out.println("Result : " + result);
        sc.close();
    }

    public static String func(String a, String b) {
        if (a.length() < b.length()) {
            return a + b + a;
        }
        return b + a + b;
    }
}
