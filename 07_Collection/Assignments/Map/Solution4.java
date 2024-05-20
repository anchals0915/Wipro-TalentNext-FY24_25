
/*
 * Question 4 : Create a Collection "ContactList" using HashMap to 
 * store name and phone number of contacts added. The program 
 * should use appropriate generics (String , Integer) and have 
 * the following abilities : 
 * 
 * a) Check if a particular key exists or not. 
 * b) Check if a particular value exists or not. 
 * c) use Iterator to loop through the map.
 * 
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution4 {
    public static void main(String[] args) {
        HashMap<String, Integer> contactList = new HashMap<>();
        contactList.put("Abc", 12567890);
        contactList.put("Def", 98765210);
        contactList.put("Ghi", 55512567);

        // a) Check if a particular key exists or not
        String nameToCheck = "Abc";
        if (nameToCheck != null && !nameToCheck.isEmpty()) {
            if (contactList.containsKey(nameToCheck)) {
                System.out.println(nameToCheck + "'s phone number: " + contactList.get(nameToCheck));
            } else {
                System.out.println(nameToCheck + " not found in contacts.");
            }
        } else {
            System.out.println("Invalid name to check.");
        }

        // b) Check if a particular value exists or not
        int numberToCheck = 98765432;
        if (contactList.containsValue(numberToCheck)) {
            System.out.println("Phone number " + numberToCheck + " found in contacts.");
        } else {
            System.out.println("Phone number " + numberToCheck + " not found in contacts.");
        }

        // c) Use Iterator to loop through the map
        Iterator<Map.Entry<String, Integer>> iterator = contactList.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("Name: " + entry.getKey() + ", Phone: " + entry.getValue());
        }
    }
}
