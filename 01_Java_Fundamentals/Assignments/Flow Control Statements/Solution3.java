
/*
 * Q.3)
 */
public class Solution3 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No values provided.");
        } else {
            System.out.print("Values entered: ");
            for (String str : args) {
                System.out.print(str + ",");
            }
        }
    }
}