import java.util.Arrays;

/*
 * Q.12)
 */
public class Solution12 {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3 };
        int[] arr2 = { 4, 5, 6 };

        int[] ans = middleElements(arr1, arr2);

        System.out.println(Arrays.toString(ans));
    }

    public static int[] middleElements(int[] a, int[] b) {
        int mid1 = a[a.length / 2];
        int mid2 = b[b.length / 2];
        return new int[] { mid1, mid2 };
    }
}
