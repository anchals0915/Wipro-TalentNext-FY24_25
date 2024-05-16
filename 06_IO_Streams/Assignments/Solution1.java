
/*
 * IO Operations 
 */

/*
 * Write a program to count the number of times a character appears in 
a File . 
Sample Input and Output : 
Enter the file name 
Input.txt 
Enter the character to be counted 
r 
File 'Input.txt' has 99 instances of letter 'r'.
*/

import java.io.FileReader;
import java.io.IOException;

public class Solution1 {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("Input.txt");
            char searchChar = 'r'; // Character to be counted
            int charCount = 0;
            int charRead;
            while ((charRead = reader.read()) != -1) {
                if ((char) charRead == searchChar) {
                    charCount++;
                }
            }
            reader.close();
            System.out.println("File 'Input.txt' has " + charCount + " instances of letter '" + searchChar + "'.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
