
import java.util.Scanner;
import java.util.Arrays;
/*
 * Q.10) Print an array that contains the exact same numbers as 
 * the given array, but rearranged so that all the even numbers 
 * come before all the odd numbers.
 * Other than that, the numbers can be in any order.
 * You may modify and print the given array , or make a new array 
 */

public class Solution10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        rearrangeEvenOdd(nums);

        System.out.println("Array with even numbers before odd numbers: " + Arrays.toString(nums));
        sc.close();
    }

    public static void rearrangeEvenOdd(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            while (left < right && nums[left] % 2 == 0) {
                left++;
            }
            while (left < right && nums[right] % 2 == 1) {
                right--;
            }
            if (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }
    }
}
