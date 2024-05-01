/*
 * Q.13)
 */
public class Solution13 {
    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Please enter 4 integer numbers");
            return;
        }

        int[][] matrix = intMatrix(args);
        System.out.println("The given array is : ");
        printMatrix(matrix);

        System.out.println("The reverse of the array is : ");
        printReverseMatrix(matrix);
    }

    public static int[][] intMatrix(String[] args) {
        int[][] ans = new int[3][3];
        return ans;
    }

    private static void printMatrix(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printReverseMatrix(int[][] mat) {
        for (int i = mat.length - 1; i >= 0; i--) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

}
