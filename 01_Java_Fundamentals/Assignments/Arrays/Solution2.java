import java.util.Scanner;

/*
 * Q.2) Write a program to initialize an integer array and find the maximum and
 * minimum value of the array
 */
public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        inputValues(sc, arr);

        int max = max(arr);
        int min = min(arr);
        System.out.println("Maximum Value = " + max);
        System.out.println("Minimum Value = " + min);

    }

    public static void inputValues(Scanner sc, int[] arr) {
        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static int min(int[] arr) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }

        return min;
    }

    public static int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }
}
