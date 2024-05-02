/*
 * Q.15) Write a program to print * on Floyds format
 * using for loop and while loop
 */
public class Solution15 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please enter an integer number");
            return;
        }

        int n = Integer.parseInt(args[0]);
        print(n);
        System.out.println();
        printPattern(n);
    }

    public static void print(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printPattern(int n) {
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

}
