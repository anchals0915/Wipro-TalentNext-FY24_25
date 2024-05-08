import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.next().trim();
        String result = firstHalfString(str);

        System.out.println("Result : " + result);
        sc.close();
    }

    public static String firstHalfString(String str) {
        if (str.length() % 2 == 0) // length is even
        {
            return str.substring(0, str.length() / 2);
        }
        return null; // the length is odd
    }
}
