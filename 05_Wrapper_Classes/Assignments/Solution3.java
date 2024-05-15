import java.util.Scanner;

/*
 * Write a Java program that reads an integer number (between 1 and 255) from the user and prints the binary representation of the number. 
 * The answer should be printed as a String 
 * 
 * Note : The output displayed should contain 8 digits and should be padded with leading 0s(zeros), in case the retured String contains less than 8 characters 
 * 
 * For example , if the user enters the value 16 , then the output shoulf be 0001000
 * ans if the user enters the value 100 , the output shoudl be 01100100
 * 
 * You are excepted to use Integer class conversion method described in the PDF file. 
 * Use Scanner class to accept user inputs.
 * 
 * [ Hint : You may use String.format() method for the expected output ]
 * 
 */
public class Solution3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        String binary = Integer.toBinaryString(num);
        binary = String.format("%8s", binary).replace(' ', '0');

        System.out.println("Binary representation: " + binary);

        sc.close();
    }
}
