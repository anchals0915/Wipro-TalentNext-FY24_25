
/*
 * Question 2 : Create a collection called HashMap which is capable of 
 * Storing String objects. The program should have the following abolities
 * 
 */
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map; // Added to import Map.Entry

public class Solution2 {

    public static void main(String[] args) {

        // Creating a HashMap and adding key-value pairs
        HashMap<String, String> h1 = new HashMap<>();
        h1.put("key1", "value1");
        h1.put("key2", "value2");
        h1.put("key3", "value3");

        // Creating an object of Solution2 to access non-static methods
        Solution2 obj = new Solution2();

        // Testing keyExists method
        System.out.println("Key 'key2' exists: " + obj.keyExists(h1, "key2"));

        // Testing valueExists method
        System.out.println("Value 'value4' exists: " + obj.valueExists(h1, "value4"));

        // Testing iterating method
        System.out.println("Iterating through the map: ");
        obj.iterating(h1);
    }

    // Method to check if a particular key exists in the HashMap
    public boolean keyExists(HashMap<String, String> h1, String key) {
        return h1.containsKey(key);
    }

    // Method to check if a particular value exists in the HashMap
    public boolean valueExists(HashMap<String, String> h1, String value) {
        return h1.containsValue(value);
    }

    // Method to iterate through the HashMap using an Iterator
    public void iterating(HashMap<String, String> h1) {
        Iterator<Map.Entry<String, String>> iterator = h1.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
