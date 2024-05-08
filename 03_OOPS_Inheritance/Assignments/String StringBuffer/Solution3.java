import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.next().trim();

        String result = copies(str);
        System.out.println("Result : " + result);
        sc.close();
    }

    public static String copies(String str) {
        String s = str.substring(0, 2);
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= str.length(); i++) {
            result.append(s);
        }
        return result.toString();
    }
}
