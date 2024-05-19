import java.util.TreeSet;

/*
* Question 4 : Implement the assignment 1 using TreeSet
*/
public class Solution4 {
    TreeSet<String> H1 = new TreeSet<>();

    // method to save country names to TreeSet
    public TreeSet<String> saveCountryNames(String countryName) {
        H1.add(countryName);
        return H1;
    }

    // method to get country name from TreeSet
    public String getCountry(String countryName) {
        if (H1.contains(countryName)) {
            return countryName;
        }
        return null;
    }

    // testing the methods using a main method
    public static void main(String[] args) {
        Solution4 obj1 = new Solution4();
        obj1.saveCountryNames("India");
        obj1.saveCountryNames("Australia");

        System.out.println(obj1.getCountry("India"));
        System.out.println(obj1.getCountry("Russia"));
    }
}
