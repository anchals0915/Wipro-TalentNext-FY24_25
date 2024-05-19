import java.util.Iterator;
import java.util.TreeSet;

/*
* Question 3 : Create a Collection called TreeSet which is 
capable of Storing String objects.Then try these following
operations.
a) Reverse the elements of the Collection 
b) Iterate the elements of the TreeSet using Iterator 
c) Check if a particular element exists or not 
*/
public class Solution3 {
    public static void main(String[] args) {
        // Creating a TreeSet to store String objects
        TreeSet<String> ts = new TreeSet<>();

        // Adding elements to the TreeSet
        ts.add("Apple");
        ts.add("Banana");
        ts.add("Orange");
        ts.add("Mango");

        // a) Reversing the elements of the Collection
        TreeSet<String> reversedTreeSet = new TreeSet<>(ts.descendingSet());

        System.out.println("Reversed elements:");
        for (String element : reversedTreeSet) {
            System.out.println(element);
        }

        // b) Iterating the elements of the TreeSet using Iterator
        System.out.println("\nIterating elements using Iterator:");
        Iterator<String> iterator = ts.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // c) Checking if a particular element exists or not
        String searchElement = "Banana";
        if (ts.contains(searchElement)) {
            System.out.println("\n'" + searchElement + "' exists in the TreeSet.");
        } else {
            System.out.println("\n'" + searchElement + "' does not exist in the TreeSet.");
        }
    }
}
