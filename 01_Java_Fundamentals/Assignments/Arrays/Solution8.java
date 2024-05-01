import java.util.Scanner;

/*
 * Q.8) Write a program to print the sum of elements of array following the
 * given below condition
 * 
 * If the array has 6 and 7 in suceeding orders, ignore the number between 6 and
 * 7 and consider the order number for calucaltion of sum
 */
public class Solution8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        inputValues(sc, arr);

        int index_6 = binarySearch(arr, 6);
        int index_7 = binarySearch(arr, 7);

        int total;

        if (index_6 != -1 && index_7 != -1 && index_6 < index_7) {
            total = sum(arr, 0, index_6 - 1) + sum(arr, index_7 + 1, arr.length - 1);
        } else {
            total = sum(arr, 0, arr.length - 1);
        }

        System.out.println("Total: " + total);

        sc.close();
    }

    public static int sum(int[] arr, int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void inputValues(Scanner sc, int[] arr) {
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

}
