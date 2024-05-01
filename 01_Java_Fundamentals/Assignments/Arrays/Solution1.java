import java.util.Scanner;

/*
 * Q.1) Write a program to initialize an integer array and print the sum and average of the array
 */
public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        inputValues(sc, arr);

        int sum = sum(arr);
        float avg = average(arr);

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);

    }

    public static void inputValues(Scanner sc, int[] arr) {
        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static float average(int[] arr) {
        int n = arr.length;
        return sum(arr) / (float) n;
    }
}
