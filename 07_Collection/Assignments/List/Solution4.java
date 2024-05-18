import java.util.ArrayList;

/*
 * Create an ArrayList that can store only numbers like int,
 * float, double, etc. but not any ohter data type 
 */
public class Solution4 {
    public static void main(String[] args) {
        ArrayList<Number> numbers = new ArrayList<>();
        numbers.add(10); // Integer
        numbers.add(3.14); // Double
        numbers.add(5.6f); // Float

        // Print the numbers
        for (Number num : numbers) {
            System.out.println(num);
        }
    }
}
