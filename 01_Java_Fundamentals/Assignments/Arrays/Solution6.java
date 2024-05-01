
import java.util.Scanner;
import java.util.Arrays;

/*
 * Q.6) Write a program to initialize an array and print them in a sorted order
 */
public class Solution6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        inputValues(sc, arr);

        bubbleSort(arr);
        System.out.println("Sorted Array : " + Arrays.toString(arr));
    }

    public static void inputValues(Scanner sc, int[] arr) {
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    // Time Complexity : O(n^2)
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    // Time Complexity : O(n^2)
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minimum = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minimum]) {
                    minimum = j;
                }
            }

            if (minimum != i) {
                // swap
                swap(arr, minimum, i);
            }
        }
    }

    // Time Complexity : O(n^2)
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = current;
        }
    }

    // Time Complexity : O(n log n )
    public static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] leftSide = mergeSort(Arrays.copyOfRange(arr, 0, mid));

        int[] rigthSide = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(leftSide, rigthSide);
    }

    public static int[] merge(int[] a1, int[] a2) {
        int[] total = new int[a1.length + a2.length];

        int i = 0; // pointer for a1
        int j = 0; // pointer for a2
        int k = 0; // pointer for total

        while (i < a1.length && j < a2.length) {
            if (a1[i] < a2[j]) {
                total[k] = a1[i];
                k = k + 1;
                i = i + 1;
            } else {
                total[k] = a2[j];
                k = k + 1;
                j = j + 1;
            }
        }

        while (i < a1.length) {
            total[k] = a1[i];
            k = k + 1;
            i = i + 1;
        }

        while (j < a2.length) {
            total[k] = a2[j];
            k = k + 1;
            j = j + 1;
        }

        return total;
    }
}
