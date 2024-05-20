import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

public class Solution1 {

    // instance variable
    HashMap<String, String> M1 = new HashMap<>();

    // method to save country-capital mapping
    public void saveCountryCapital(String countryName, String capital) {
        M1.put(countryName, capital);
    }

    // return the capital for the country passed, from the Map M1
    public String getCapital(String countryName) {
        return M1.get(countryName);
    }

    // return the country for the specified capital
    public String getCountry(String capitalName) {
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            if (entry.getValue().equals(capitalName)) {
                return entry.getKey();
            }
        }
        return "No Country with specified capital Name";
    }

    // save country-capital mapping (reverse) into a new HashMap M2
    public HashMap<String, String> saveCapitalCountry(String countryName, String capital) {
        M1.put(countryName, capital);
        return M1;
    }

    // create and return a new HashMap with Capital as key and Country as value
    public HashMap<String, String> getCapitalCountryMap() {
        HashMap<String, String> M2 = new HashMap<>();
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            M2.put(entry.getValue(), entry.getKey());
        }
        return M2;
    }

    // create and return an ArrayList with all Country names stored as keys in M1
    public ArrayList<String> getAllCountries() {
        ArrayList<String> countries = new ArrayList<>(M1.keySet());
        return countries;
    }

    // main method to test the functionalities
    public static void main(String[] args) {
        Solution1 obj = new Solution1();

        // Save some country-capital mappings
        obj.saveCountryCapital("India", "Delhi");
        obj.saveCountryCapital("Japan", "Tokyo");

        // Test getCountry method
        System.out.println("Country for capital Tokyo: " + obj.getCountry("Tokyo"));

        // Save a country-capital mapping in reverse
        obj.saveCapitalCountry("USA", "Washington D.C.");

        // Test getCapitalCountryMap method
        System.out.println("Capital-Country Map: " + obj.getCapitalCountryMap());

        // Test getAllCountries method
        System.out.println("All Countries: " + obj.getAllCountries());
    }
}
