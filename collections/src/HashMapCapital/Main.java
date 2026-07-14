package HashMapCapital;

import java.util.*;

class CountryMap {

    HashMap<String, String> M1 = new HashMap<>();

    // 1. Add country and capital
    public HashMap<String, String> saveCountryCapital(String countryName, String capital) {
        M1.put(countryName, capital);
        return M1;
    }

    // 2. Get capital using country name
    public String getCapital(String countryName) {
        return M1.get(countryName);
    }

    // 3. Get country using capital name
    public String getCountry(String capitalName) {
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            if (entry.getValue().equals(capitalName)) {
                return entry.getKey();
            }
        }
        return null;
    }

    // 4. Create reverse map (Capital -> Country)
    public HashMap<String, String> createReverseMap() {
        HashMap<String, String> M2 = new HashMap<>();

        for (Map.Entry<String, String> entry : M1.entrySet()) {
            M2.put(entry.getValue(), entry.getKey());
        }

        return M2;
    }

    // 5. Create ArrayList of countries
    public ArrayList<String> getCountryList() {
        ArrayList<String> list = new ArrayList<>();

        for (String country : M1.keySet()) {
            list.add(country);
        }

        return list;
    }
}

public class Main {
    public static void main(String[] args) {

        CountryMap cm = new CountryMap();

        cm.saveCountryCapital("India", "Delhi");
        cm.saveCountryCapital("Japan", "Tokyo");
        cm.saveCountryCapital("USA", "Washington");
        cm.saveCountryCapital("Australia", "Canberra");

        System.out.println("Original Map:");
        System.out.println(cm.M1);

        System.out.println("\nCapital of India: " +
                cm.getCapital("India"));

        System.out.println("Country of Tokyo: " +
                cm.getCountry("Tokyo"));

        System.out.println("\nReverse Map:");
        System.out.println(cm.createReverseMap());

        System.out.println("\nCountry List:");
        System.out.println(cm.getCountryList());
    }
}