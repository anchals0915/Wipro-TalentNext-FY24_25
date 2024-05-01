
import java.util.Scanner;

/*
 * Q.3) Write a program to intitaialize an integer array with values
 * and check if a given number is present in the array or not
 */
public class Solution3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        inputValues(sc, arr);

        System.out.print("Enter the search element : ");
        int target = sc.nextInt();

        System.out.println(search(arr, target));

    }

    public static void inputValues(Scanner sc, int[] arr) {
        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    // Linear Search
    // Time Complexity : O( n )
    public static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // Binary Search
    // Time Complexity : O( log n )
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
