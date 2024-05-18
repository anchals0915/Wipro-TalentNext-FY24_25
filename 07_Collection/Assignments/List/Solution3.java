import java.util.ArrayList;
import java.util.Iterator;;

/*
 * Create an arrayList that can store only Strings. 
 * Create a printAll mwthod that will print 
 * all the elements of the ArrayList using an Iterator 
 */
public class Solution3 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("One");
        arr.add("Two");
        arr.add("Three");

        printAll(arr);
    }

    static void printAll(ArrayList<String> list) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
