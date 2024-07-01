
// write a program that takes as input the size of the 
// array 

import java.util.*;

public class Solution1 extends Exception {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements of array ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter a index of the array element you want to access");
        int index = sc.nextInt();
        try {
            System.out.println("The array element at index " + index + " = " + arr[index]);
            System.out.println("The array element successfully accessed");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getClass().getName());
        } catch (Exception e) {
            System.out.println(e.getClass().getName());
        }

        sc.close();
    }

}
