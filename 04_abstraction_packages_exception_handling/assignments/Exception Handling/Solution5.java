
import java.util.*;

/*
* Write a program to accept name and age of a person from
* the command prompt ( passed as arguments then your execute
* the class) and ensure that the age entered is >=218
* and <60
* Display proper error messages.
* 
* The program must exit gracefully after displaying the error
* message in case the argument spassed are not proper .
* 
*/

// Solution 5 

class InvalidAgeException extends Exception {
    InvalidAgeException(String str) {
        super(str);
    }
}

class InvalidNumberOfInputException extends Exception {
    InvalidNumberOfInputException(String str) {
        super(str);
    }
}

public class Solution5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {

            if (args.length != 2) {
                throw new InvalidNumberOfInputException("Please enter exactly 2 values");
            }
            String name = args[0];
            int age = Integer.parseInt(args[1]);
            if (age < 18 || age >= 218) {
                throw new InvalidAgeException("Age should be between 18 and 217");
            }

        } catch (InvalidNumberOfInputException e) {
            System.out.println(e.getMessage());
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println(e.getClass().getSimpleName());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }

    }
}