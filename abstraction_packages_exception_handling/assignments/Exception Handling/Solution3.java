import java.util.*;

/*
 * Write a program to take care of Number Format Exception
 * 
 */
class NegativeNumberException extends Exception {
    public NegativeNumberException(String str) {
        super(str);
    }
}

public class Solution3 {

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the name of Student 1 : ");
            String s1 = sc.nextLine();

            int sum1 = 0;
            float avg1 = 0.0f;
            int[] marks1 = new int[3];
            System.out.println("Enter the marks of Student 1 : ");
            for (int i = 0; i < marks1.length; i++) {
                marks1[i] = sc.nextInt();
                if (marks1[i] < 0) {
                    throw new NegativeNumberException("Marks should in range of 0-100");
                }
                sum1 += marks1[i];
            }
            avg1 = sum1 / 3;

            int sum2 = 0;
            float avg2 = 0.0f;
            System.out.println("Enter the name of Student 2 : ");
            String s2 = sc.nextLine();

            int[] marks2 = new int[3];
            System.out.println("Enter the marks of Student 2 : ");
            for (int i = 0; i < marks2.length; i++) {
                marks2[i] = sc.nextInt();
                if (marks2[i] < 0) {
                    throw new NegativeNumberException("Marks should in range of 0-100");
                }
                sum2 += marks2[i];
            }

            avg2 = sum2 / 3;

            System.out.println("Average of Marks of Student 1 : " + avg1);
            System.out.println("Average of Marks of Student 2 : " + avg2);

        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println(e.getClass().getName());
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}






