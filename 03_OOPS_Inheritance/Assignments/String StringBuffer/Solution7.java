
import java.util.Scanner;

/*
 * Given a string, if the first or last char are 'x' 
 * return the string without those 'x' chars , toherwise 
 * return the string unchanged.
 * If the input is 'xHix' ==> "Hi"
 */
public class Solution7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.next().trim();

        String result = func(str);
        System.out.println("Result : " + result);
        sc.close();
    }

    public static String func(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != 'x') {
                break;
            } else {
                str = str.substring(i + 1, str.length());
            }
        }

        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) != 'x') {
                break;
            } else {
                str = str.substring(0, i);
            }
        }
        return str;
    }
}
