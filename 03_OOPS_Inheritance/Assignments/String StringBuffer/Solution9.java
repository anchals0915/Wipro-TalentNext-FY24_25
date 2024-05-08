import java.util.Scanner;

public class Solution9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a two String : ");
        String[] str = sc.nextLine().trim().split(",");

        String result = fun(str[0], str[1]);
        System.out.println("Result : " + result);
        sc.close();
    }

    public static String fun(String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int j = 0;
        while (i < s1.length() && j < s2.length()) {
            sb.append(s1.charAt(i));
            sb.append(s2.charAt(j));
            i = i + 1;
            j = j + 1;
        }

        while (i < s1.length()) {
            sb.append(s1.charAt(i));
            i = i + 1;
        }

        while (j < s2.length()) {
            sb.append(s2.charAt(j));
            j = j + 1;
        }

        return sb.toString();
    }
}
