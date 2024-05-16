/*
 * Write a program to copy contents from one file to another and check the output 
 * Sample Input and Output : 
 * Enter the input file name 
 * Input.txt
 * Enter the output file name 
 * Output.txt
 * File is copied
 */

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Solution2 {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("Input.txt");
            FileWriter writer = new FileWriter("Output.txt");
            int charRead;
            while ((charRead = reader.read()) != -1) {
                writer.write(charRead);
            }
            reader.close();
            writer.close();
            System.out.println("File is copied");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
