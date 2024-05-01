
/*
 * Q.11)
 */
public class Solution11 {
    public static void main(String[] args) {
        int[] arr1 = { 1, 4, 1, 4 };
        System.out.println(check1_4(arr1));

        int[] arr2 = { 1, 4, 2, 4 };
        System.out.println(check1_4(arr2));

        int[] arr3 = { 1, 1 };
        System.out.println(check1_4(arr3));
    }

    public static boolean check1_4(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 1 && arr[i] != 4) {
                return false;
            }
        }
        return true;
    }

}
