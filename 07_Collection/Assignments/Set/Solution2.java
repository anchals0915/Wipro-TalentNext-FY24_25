
import java.util.HashSet;
import java.util.Iterator;

/*
 * Question 2 : Write a program to store a group of 
 * employee names into a HashSet, retrieve the elements
 * one by one using an Iterator.
 * 
*/
public class Solution2 {
    public static void main(String[] args) 
    {
        // Creating a HashSet to store employee names
        HashSet<String> employeeNames = new HashSet<>();

        // Adding employee names to the HashSet
        employeeNames.add("Anchal Singh");
        employeeNames.add("Keerthi Sureka");
        employeeNames.add("Palki Devi Barman");
        employeeNames.add("Jyotsna Kerthi");

        // Retrieving elements one by one using an Iterator
        Iterator<String> iterator = employeeNames.iterator();
        System.out.println("Employee names:");
        while (iterator.hasNext()) 
        {
            System.out.println(iterator.next());
        }
    }
}

