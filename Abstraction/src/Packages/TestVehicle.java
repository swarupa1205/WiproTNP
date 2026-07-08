package Packages;

import com.automobile.twowheeler.Hero;
import com.automobile.fourwheeler.Honda;

public class TestVehicle {

    public static void main(String[] args) {

        Hero h = new Hero();

        System.out.println("Hero Details");
        System.out.println("Model Name : " + h.getModelName());
        System.out.println("Registration Number : " + h.getRegistrationNumber());
        System.out.println("Owner Name : " + h.getOwnerName());
        System.out.println("Speed : " + h.getSpeed());

        h.radio();

        System.out.println();

        Honda c = new Honda();

        System.out.println("Honda Details");
        System.out.println("Model Name : " + c.getModelName());
        System.out.println("Registration Number : " + c.getRegistrationNumber());
        System.out.println("Owner Name : " + c.getOwnerName());
        System.out.println("Speed : " + c.getSpeed());

        c.cdplayer();
    }
}