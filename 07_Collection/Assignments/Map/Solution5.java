import java.util.Map;
import java.util.TreeMap;

public class Solution5 {
    // instance variable
    private TreeMap<String, String> M1 = new TreeMap<>();

    // method to save country-capital pair
    public void saveCountryCapital(String countryName, String capital) {
        M1.put(countryName, capital);
    }

    // method to return the capital for the given country
    public String getCapital(String countryName) {
        return M1.get(countryName);
    }

    // method to return the country for the given capital
    public String getCountry(String capitalName) {
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            if (entry.getValue().equals(capitalName)) {
                return entry.getKey();
            }
        }
        return "No Country with specified capital Name";
    }

    // method to save capital-country pair
    public void saveCapitalCountry(String countryName, String capital) {
        M1.put(countryName, capital);
    }

    // method to create a map with capital as key and country as value
    public TreeMap<String, String> createCapitalCountryMap() {
        TreeMap<String, String> M2 = new TreeMap<>();
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            M2.put(entry.getValue(), entry.getKey());
        }
        return M2;
    }

    // method to create an ArrayList with all country names
    // stored as keys in the map
    // This method should return the ArrayList
    // NOTE: You can test the methods using a main method
    public static void main(String[] args) {
        Solution5 obj = new Solution5();
        obj.saveCountryCapital("India", "Delhi");
        obj.saveCountryCapital("Japan", "Tokyo");

        System.out.println("Country for capital Tokyo: " + obj.getCountry("Tokyo"));

        TreeMap<String, String> capitalCountryMap = obj.createCapitalCountryMap();
        System.out.println("Capital-Country Map: " + capitalCountryMap);
    }
}
