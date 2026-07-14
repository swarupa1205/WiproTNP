package Properties;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Properties p = new Properties();

        p.setProperty("Andhra Pradesh", "Amaravati");
        p.setProperty("Telangana", "Hyderabad");
        p.setProperty("Tamil Nadu", "Chennai");
        p.setProperty("Karnataka", "Bengaluru");

        Iterator<Object> itr = p.keySet().iterator();

        System.out.println("State\t\tCapital");

        while (itr.hasNext()) {
            String state = (String) itr.next();
            System.out.println(state + "\t\t" + p.getProperty(state));
        }
    }
}