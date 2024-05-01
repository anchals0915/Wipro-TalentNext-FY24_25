import java.util.Scanner;

/*
 * Q.5) Write a program to find the largest 2 numbers and the smallest 2 number
 * in the given array
 */
public class Solution5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        inputValues(sc, arr);

        int[] largest = largestValues(arr);
        System.out.println("Largest Value : " + largest[0]);
        System.out.println("Second Largest Value : " + largest[1]);

        int[] smallest = smallestValues(arr);
        System.out.println("Largest Value : " + smallest[0]);
        System.out.println("Second Largest Value : " + smallest[1]);

    }

    public static void inputValues(Scanner sc, int[] arr) {
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static int[] largestValues(int[] arr) {
        Integer larg = null;
        Integer secLarg = null;

        int[] largest = new int[2]; // largest secondLargest

        for (int i = 0; i < arr.length; i++) {
            if (larg == null || arr[i] > larg) {
                secLarg = larg;
                larg = arr[i];
            } else if (secLarg == null || arr[i] > secLarg) {
                secLarg = arr[i];
            }
        }

        largest[0] = larg != null ? larg : 0; // If no valid largest found, assign 0
        largest[1] = secLarg != null ? secLarg : 0; // If no valid second largest found, assign 0

        return largest;
    }

    public static int[] smallestValues(int[] arr) {
        Integer small = null;
        Integer secSmall = null;

        int[] smallest = new int[2]; // smallest secondSmallest

        for (int i = 0; i < arr.length; i++) {
            if (small == null || arr[i] < small) {
                secSmall = small;
                small = arr[i];
            } else if (secSmall == null || arr[i] < secSmall) {
                secSmall = arr[i];
            }
        }

        smallest[0] = small != null ? small : 0; // If no valid smallest found, assign 0
        smallest[1] = secSmall != null ? secSmall : 0; // If no valid second smallest found, assign 0

        return smallest;
    }

}
