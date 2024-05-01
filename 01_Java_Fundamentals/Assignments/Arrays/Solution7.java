import java.util.Scanner;
import java.util.*;

/*
 * Q.7) Write a program to remove the duplicate elements in an array and print
 * the same.
 */
public class Solution7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        inputValues(sc, arr);

        int[] uniqueArr = unique(arr);

        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Array with unique elements: " + Arrays.toString(uniqueArr));
    }

    public static int[] unique(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        // Convert HashSet back to array
        int[] uniqueArr = new int[set.size()];
        int index = 0;
        for (int num : set) {
            uniqueArr[index++] = num;
        }
        return uniqueArr;
    }

    public static void inputValues(Scanner sc, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }
}
