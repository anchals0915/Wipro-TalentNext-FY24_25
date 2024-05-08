import java.util.Scanner;

public class Solution5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.next().trim();

        String result = withoutFirstLast(str);
        System.out.println("Result : " + result);
        sc.close();
    }

    public static String withoutFirstLast(String str) {
        return str.substring(1, str.length() - 1);
    }
}
