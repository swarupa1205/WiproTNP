package com.automobile.fourwheeler;

import com.automobile.Vehicle;

public class Ford extends Vehicle {

    public String getModelName() {
        return "Ford";
    }

    public String getRegistrationNumber() {
        return "AP01BB2222";
    }

    public String getOwnerName() {
        return "Swarupa";
    }

    public int speed() {
        return 110;
    }

    public void tempControl() {
        System.out.println("Air conditioning facility available");
    }
}