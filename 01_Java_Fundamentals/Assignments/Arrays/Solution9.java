
import java.util.Arrays;

/*
 * Q.9) Print a version of the given array where all the 10's
 * have been removed. 
 * The remaining elements should shift left towards the start of 
 * the array as needed, and the  empty spaces at the end of the 
 * array should be 0. 
 * So {1,10,10,2} yields {1,2,0,0}
 * You may modify and display the given array or make a new array 
 */
public class Solution9 {
    public static void main(String[] args) {
        int[] nums = { 1, 10, 10, 2 };
        System.out.println("Original array: " + Arrays.toString(nums));

        int[] result = removeTens(nums);
        System.out.println("Array with 10's removed: " + Arrays.toString(result));
    }

    public static int[] removeTens(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num != 10) {
                nums[count++] = num;
            }
        }

        // Fill the remaining spaces with 0
        while (count < nums.length) {
            nums[count++] = 0;
        }

        return nums;
    }

}
