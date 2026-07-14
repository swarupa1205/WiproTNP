package TreeSetCountry;

import java.util.TreeSet;

class Country {
    TreeSet<String> T1 = new TreeSet<>();

    public TreeSet<String> saveCountryNames(String countryName) {
        T1.add(countryName);
        return T1;
    }

    public String getCountry(String countryName) {
        for (String country : T1) {
            if (country.equals(countryName)) {
                return country;
            }
        }
        return null;
    }
}

public class Main {
    public static void main(String[] args) {

        Country c = new Country();

        c.saveCountryNames("India");
        c.saveCountryNames("USA");
        c.saveCountryNames("Japan");
        c.saveCountryNames("Australia");

        System.out.println("Countries: " + c.T1);

        System.out.println("Search India: " + c.getCountry("India"));
        System.out.println("Search China: " + c.getCountry("China"));
    }
}