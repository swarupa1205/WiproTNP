package ContactList;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Integer> contactList = new HashMap<>();

        contactList.put("Devi", 987654321);
        contactList.put("Venu", 912345678);
        contactList.put("Sai", 998877665);
        contactList.put("Kiran", 987123456);

        // Check key
        if(contactList.containsKey("Devi"))
            System.out.println("Name exists");
        else
            System.out.println("Name not found");

        // Check value
        if(contactList.containsValue(912345678))
            System.out.println("Phone number exists");
        else
            System.out.println("Phone number not found");

        // Iterator
        Iterator<Map.Entry<String,Integer>> itr =
                contactList.entrySet().iterator();

        System.out.println("\nContacts:");

        while(itr.hasNext()){
            Map.Entry<String,Integer> entry = itr.next();

            System.out.println(
                    entry.getKey() +
                    " -> " +
                    entry.getValue());
        }
    }
}