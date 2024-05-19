import java.util.HashSet;

// Assignment : Set 
/*
 * Question 1 : Develop a java class with a instance variable 
 * H1 (HashSet) add a method saveCountryNames(String CountryName) ,
 * the method should add the passed country to a HashSet(H1)
 * and return the added HashSet(H1)
 * Develop a method getCountry(String CountryName) which 
 * iterates through the HashSet and returns the country 
 * if exist else return null 
 * 
 * NOTE : You can test the methods using a main method 
 * 
 */

public class Solution1 {
    HashSet<String> H1 = new HashSet<>();

    // method to save country names to HashSet
    public HashSet<String> saveCountryNames(String countryName) {
        H1.add(countryName);
        return H1;
    }

    // method to get country name from HashSet
    public String getCountry(String countryName) {
        if (H1.contains(countryName)) {
            return countryName;
        }
        return null;
    }

    // testing the methods using a main method
    public static void main(String[] args) {
        Solution1 obj1 = new Solution1();
        obj1.saveCountryNames("India");
        obj1.saveCountryNames("Australia");

        System.out.println(obj1.getCountry("India"));
        System.out.println(obj1.getCountry("Russia"));
    }
}
