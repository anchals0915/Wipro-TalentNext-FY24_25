
/*
 * Q.14)
 */
public class Solution14 {
    public static void main(String[] args) {
        if (args.length != 9) {
            System.out.println("Please enter 9 integer numbers");
        }

        System.out.println("The given array is : ");
        printMatrix(args);

        int max = max(args);
        System.out.println("The biggest number in the given is " + max);
    }

    public static int max(String[] args) {
        int max = Integer.MIN_VALUE;
        for (String ele : args) {
            max = Math.max(max, Integer.parseInt(ele));
        }

        return max;
    }

    public static void printMatrix(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if ((i + 1) % 3 == 0) {
                System.out.println(arr[i] + " ");
            } else {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
