package TreeMapImplemantion;

import java.util.*;

class CountryMap {
    TreeMap<String,String> M1 = new TreeMap<>();

    public TreeMap<String,String> saveCountryCapital(
            String country,
            String capital) {

        M1.put(country, capital);
        return M1;
    }

    public String getCapital(String country) {
        return M1.get(country);
    }

    public String getCountry(String capital) {
        for(Map.Entry<String,String> e : M1.entrySet()) {
            if(e.getValue().equals(capital))
                return e.getKey();
        }
        return null;
    }

    public TreeMap<String,String> createReverseMap() {
        TreeMap<String,String> M2 = new TreeMap<>();

        for(Map.Entry<String,String> e : M1.entrySet()) {
            M2.put(e.getValue(), e.getKey());
        }

        return M2;
    }

    public ArrayList<String> getCountryList() {
        ArrayList<String> list = new ArrayList<>(M1.keySet());
        return list;
    }
}

public class Main {
    public static void main(String[] args) {

        CountryMap c = new CountryMap();

        c.saveCountryCapital("India","Delhi");
        c.saveCountryCapital("Japan","Tokyo");
        c.saveCountryCapital("USA","Washington");

        System.out.println(c.M1);
        System.out.println(c.getCapital("India"));
        System.out.println(c.getCountry("Tokyo"));
        System.out.println(c.createReverseMap());
        System.out.println(c.getCountryList());
    }
}