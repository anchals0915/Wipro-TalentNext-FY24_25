import java.util.Scanner;

/* Q.4) Initialize an integer array with ascii values and print the
 * corresponding character values in a single row
 */
public class Solution4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        String ans = "";
        for (int i = 0; i < arr.length; i++) {
            ans += (char) (arr[i]);
        }
        System.out.println(ans);
        sc.close();
    }
}
