import java.util.Scanner;

public class Solution10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String[] str = sc.next().trim().split(",");

        String s1 = str[0];
        int n = Integer.parseInt(str[1]);

        String result = fun(s1, n);
        System.out.println("Result : " + result);
        sc.close();
    }

    public static String fun(String str, int n) {
        StringBuilder sb = new StringBuilder();
        String rep = str.substring(n - 1, str.length());

        for (int i = 1; i <= n; i++) {
            sb.append(rep);
        }
        return sb.toString();
    }
}